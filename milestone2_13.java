// 13. PIN=((largest digit in input1)x(largest digit in input2)x(largest digit in input3))+input4.
import java.util.Scanner;

public class milestone2_13 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.print(Pin(a,b,c,d));
        sc.close();
    }
    public static int Pin(int input1,int input2,int input3,int input4){
        return ((lar(input1)*lar(input2)*lar(input3))+input4);
    }
    public static int lar(int a){
        int m=a%10;
        while(a!=0){
            int t=a%10;
            a/=10;
            if(t>m)m=t;
        }
        return m;
    }
}