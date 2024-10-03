
import java.util.Scanner;

public class fibonacci {
    public static void calFibo(int a,int b,int n){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        calFibo(b, a+b, n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=sc.nextInt();
        System.out.print("The fibonacci series of "+n+" terms is ");
        calFibo(0, 1, n);
        sc.close();
    }    
}
