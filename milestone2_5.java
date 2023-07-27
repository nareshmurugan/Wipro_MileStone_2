// 5. Find the first repeated element in the given array from the first index.
import java.util.*;

public class milestone2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ar[]=new int[n];
        for (int i=0;i<n;ar[i++]=sc.nextInt());
        System.out.print(repeated(ar,n));
        sc.close();
    }

    public static int repeated(int[]input1,int input2) {
        for (int i=0;i<input1.length;i++){
            if(input1[i]<1)continue;
            for (int j=i+1;j<input1.length;j++)if(input1[i]==input1[j])return input1[i];
        }
        for (int i=0;i<input1.length;i++)if(input1[i]>0)return input1[i];
        return 0;
    }
}
