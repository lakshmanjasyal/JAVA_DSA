
import java.util.Scanner;


public class factorial {
    public static int  printFactorial(int n){
        // if(n<0){
        //     System.out.print("Invalid");
        //     return;
        // } .   ----->>>This will not work because it function must return double value 
       int factorial=1;
       for(int i=n;i>=1;i--){
        factorial*=i;
       }
       return factorial;
    }
    public static long fact(int n){
        if(n==0|| n==1)return 1;
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int x=sc.nextInt();
        long z=fact(x);
        System.out.print("The factorial of "+x+" is "+ z);
    }   
}
