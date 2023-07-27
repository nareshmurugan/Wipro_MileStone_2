// 6. Find PIN:
// You are at Level-1 of a Maths Game.
// You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN.
// The three numbers input1, input2 and input3 are four digit numbers within the range >=1000 and <=9999. i.e.
// 1000<=input1<=9999
// 1000<=input2<=9999
// 1000<=input3<=9999

// input4 is a positive integer number.

// PIN=((MAX digit of input1 X MIN digit of input1) X (MAX digit of input2 X MIN digit of input2) X (MAX digit of input3 X MIN digit of input3)) - input 4.

// Example - If input1=3521, input2=2452, input3=1352, and input4=38, 
// then PIN=((5x1)x(5x2)x(5x1))-38 = (5x10x5) - 38 = 212

// Assuming that the 4 numbers are passed to the given function, complete the given function to find and return the PIN.

import java.util.Scanner;
public class milestone2_6 {
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