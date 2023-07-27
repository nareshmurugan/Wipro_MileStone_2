// 4. Find sum of all prime numbers in the array. except the largest prime numbers.
import java.util.*;

class milestone2_4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ar[]=new int[n];
        for (int i=0;i<n;ar[i++]=sc.nextInt());
        System.out.print(Prime(ar,n));
        sc.close();
    }
    
    public static int Prime(int[]input1,int input2) {
        Arrays.sort(input1);
        int res=0;
        boolean ch=true;
        for (int i=input1.length-1;i>=0;i--) {
            if(isprime(input1[i])){
                if(ch){
                    ch=false;
                    continue;
                }
                res+=input1[i];
            }
        }
        return res;
    }

    public static boolean isprime(int a) {
        if(a<2)return false;
        for(int i=2;i<a;i++)if(a%i==0)return false;
        return true;
    }
}