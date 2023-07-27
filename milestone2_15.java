// 15. Below are the rules for generating the PIN-
// 1. The PIN should made up of 4 digits.
// 2. The THOUSAND position of the PIN should be the smallest digit across the three input numbers.
// 3. The HUNDRED position of the PIN should be the largest digit across the three input numbers.
// 4. The TENS position of the PIN should be the digit with minimum frequency i.e. the digit that occurs the least number of times across the three input numbers. If there are more than one digit that occur with min frequency.
// choose the smallest of them.
// 5. The ONES position of the PIN should be the digit with maximum frequency i.e. the digit that occurs the most number of times across three input numbers. If there are more than one digit that occur with frequency, choose the largest of them.

import java.util.*;
public class milestone2_15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.print(Pin(a,b,c));
        sc.close();
    }

    public static int Pin(int input1,int input2,int input3){
       TreeMap<Integer,Integer>tm=new TreeMap<Integer,Integer>();
       fre(tm,input1);
       fre(tm,input2);
       fre(tm,input3);
       int min=Collections.min(tm.keySet());
       int max=Collections.max(tm.keySet());
       int maxi=Collections.max(tm.values());
       int mini=Collections.min(tm.values());
       for(int a:tm.keySet()){
            if(tm.get(a)==mini){
                mini=a;
                break;
            }
       }
       Map<Integer, Integer>mm=tm.descendingMap();
       for(int a:mm.keySet()){
            if(mm.get(a)==maxi){
                maxi=a;
                break;
            }
       }
       String s=""+min+max+mini+maxi;
       return Integer.valueOf(s);
    }

    public static void fre(TreeMap<Integer,Integer>m,int a) {
        while(a!=0){
            int t=a%10;
            a/=10;
            if(m.containsKey(t)){
                int inc=m.get(t);
                m.put(t , ++inc);
            }
            else m.put(t,1);
        }
    }   

}