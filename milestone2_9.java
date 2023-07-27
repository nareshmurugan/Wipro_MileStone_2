
// 9. PIN=((MAX digit of input1 X MIN digit of input1) + (MAX digit of input2 X MIN digit of input2) + (MAX digit of input3 X MIN digit of input3)) - input 4.

import java.util.Scanner;
public class milestone2_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.print(Pin(a,b,c,d));
        sc.close();
    }
    public static int Pin(int input1,int input2,int input3,int input4){
        return ((max(input1)*min(input1))+(max(input2)*min(input2))+(max(input3)*min(input3)))-input4;
    }
    public static int max(int a){
        int m=a%10;
        while(a!=0){
            int t=a%10;
            a/=10;
            if(t>m)m=t;
        }
        return m;
    }
    public static int min(int a){
        int m=a%10;
        while(a!=0){
            int t=a%10;
            a/=10;
            if(t<m)m=t;
        }
        return m;
    }
}