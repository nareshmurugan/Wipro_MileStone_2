// 10. If input4 is EVEN, the PIN = (sum of even digits in input1, input2 and input3)
// If input4 is ODD, the PIN = (sum of odd digits in input1, input2 and input3)

import java.util.Scanner;

public class milestone2_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.print(Pin(a,b,c,d));
        sc.close();
    }

    public static int Pin(int input1,int input2,int input3,int input4){
        if(input4%2==0){
            return even(input1)+even(input2)+even(input3);
        }
        else{
            return odd(input1)+odd(input2)+odd(input3);
        }
    }
    public static int even(int a) {
        int s=0;
        while(a!=0){
            int t=a%10;
            a/=10;
            if(t%2==0)s+=t;
        }
        return s;
    }
    public static int odd(int a) {
        int s=0;
        while(a!=0){
            int t=a%10;
            a/=10;
            if(t%2!=0)s+=t;
        }
        return s;
    }
}