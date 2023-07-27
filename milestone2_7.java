// 7. Find PIN:
// You are at Level-1 of a Maths Game.
// You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN.
// The three numbers input1, input2 and input3 are four digit numbers within the range >=1000 and <=9999. i.e.
// 1000<=input1<=9999
// 1000<=input2<=9999
// 1000<=input3<=9999

// input4 is a positive integer number.

// If input4 is EVEN, the PIN = (sum of EVEN POSITIONED digits of input1 input2 input3) - (sum of ODD POSITIONED digits of input1 and input2 and input3)
// If input4 is ODD, the PIN = (sum of ODD POSITIONED digits of input1 input2 input3) - (sum of EVEN POSITIONED digits of input1 and input2 and input3)

// Example1 - If input4=38(an EVEN number) and if input1=3521, input2=2452, input3=1352, then PIN =(3+2+2+5+1+5)-(5+1+4+2+3)=1

// Example2 - If input4 =37 (an ODD number) and if input1=3521.

import java.util.Scanner;

public class milestone2_7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.print(Pin(a,b,c,d));
        sc.close();
    }

    public static int Pin(int input1,int input2,int input3,int input4){
        int evenpos=EvenPos(input1)+EvenPos(input3)+EvenPos(input3);
        int oddpos=OddPos(input1)+OddPos(input3)+OddPos(input3);
        if(input4%2==0)return evenpos-oddpos;
        else return oddpos-evenpos;
    }
    public static int EvenPos(int a) {
        return (a/1000)+((a%100)/10);
    }
    public static int OddPos(int a) {
        return (a%10)+((a/100)%10);
    }
}