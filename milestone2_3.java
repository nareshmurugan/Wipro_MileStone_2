// 3. Calculate sum of non prime index values in an array.

import java.util.Scanner;

public class milestone2_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ar[]=new int[n];
        for (int i=0;i<n;ar[i++]=sc.nextInt());
        System.out.print(repeated(ar,n));
        sc.close();
    }

    public static int repeated(int[]input1,int input2) {
        int res=0;
        for (int i=0;i<input1.length;i++)if(isprime(input1[i]))res+=i;
        return res;
    }

    public static boolean isprime(int a) {
        if(a<2)return false;
        for(int i=2;i<a;i++)if(a%i==0)return false;
        return true;
    }
}