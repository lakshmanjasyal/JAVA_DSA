
import java.util.Scanner;

public class xraisedn {
    public static int calPower(int x,int n){
        if(n==0) return 1;
        if(x==0) return 0;
        int xPownm1=calPower(x, n-1);
        int xPown=x*xPownm1;
        return xPown;
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the base:x ");
       int x=sc.nextInt();
       System.out.print("Enter the power:n ");
       int n=sc.nextInt();
       System.out.print(x+" raised to power "+n+" is "+calPower(x, n));
   } 
}
