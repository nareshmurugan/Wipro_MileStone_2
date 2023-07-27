// 2. Find the first repeated element in the given array from the tail of the array:
// Rajeev works on the data center lab of the survey department. he has been assigned the task of identifying "Repeated numbers" in a given set of numbers. He approaches you to help him acheive this.
// Given an array of numbers, your task is to return the first number that repeats (appears again) starting from the last index.

// Special conditions to taken care:
// ---------------------------------
// Note 1: you should ignore the negative numbers and zeros. The program should consider only non-zero, non-negative numbers from the given array.
// Note 2: If no number is repeated then the output should be the last element of the array.
// Note 3: If all the elements in the array are negative or 0's, the output should be 0.

import java.util.*;

public class milestone2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ar[]=new int[n];
        for (int i=0;i<n;ar[i++]=sc.nextInt());
        System.out.print(repeated(ar,n));
        sc.close();
    }

    public static int repeated(int[]input1,int input2) {
        for (int i=input1.length-1;i>=0;i--){
            if(input1[i]<1)continue;
            for (int j=i-1;j>=0;j--)if(input1[i]==input1[j])return input1[i];
        }
        for (int i=input1.length-1;i>=0;i--)if(input1[i]>0)return input1[i];
        return 0;
    }
}