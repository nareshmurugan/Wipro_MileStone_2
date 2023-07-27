// 1. Find sum of all prime numbers in the array, except the smallest prime number:
// Madhav has assigned the task of finding the sum of all prime number in the array, except the smallest prime number in the array. Madhav approaches you to help him do this by writing a program.
// Given an array of numbers, you are expected to find the sum of all prime numbers in the given array. You must however exclude the smallest prime number while performing this addition.

// For Example:
// if input1={10,41,18,50,43,31,29,25,59,96,67} representing the given array and input2=11 representing the number of elements in the array, then the expected output is 241, which is the sum of all prime numbers in this array except the smallest prime number 29.

// Explanation: The prime number in this array are 41,43,31,29,59 and 67.
// The smallest prime number in this array is 29.
// So, let us leave out 29 and add all the other prime numbers to get the output. Therefore, output=41+43+31+59+67=241.

import java.util.*;

class milestone2_1{
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
        for (int i : input1) {
            if(isprime(i)){
                if(ch){
                    ch=false;
                    continue;
                }
                res+=i;
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
