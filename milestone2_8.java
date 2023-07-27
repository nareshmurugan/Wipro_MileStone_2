// 8. PIN = ((smallest digit in input1) x (LARGEST digit in input2) x (smallest digit in input3)) - input4
import java.util.Scanner;

public class milestone2_8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
        System.out.print(Pin(a,b,c,d));
        sc.close();
    }
    public static int Pin(int input1,int input2,int input3,int input4){
        return ((sml(input1)*lar(input2)*sml(input3))-input4);
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
    public static int sml(int a){
        int m=a%10;
        while(a!=0){
            int t=a%10;
            a/=10;
            if(t<m)m=t;
        }
        return m;
    }
}