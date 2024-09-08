
import java.util.Scanner;


public class GCD {
    public static int printGCD(int n1,int n2){
            while(n1!=n2){
                if(n1>n2){n1=n1-n2;}
                else{n2=n2-n1;}
                }
        return n2;    
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int x=sc.nextInt();
        System.out.print("Enter 2nd number:");
        int y=sc.nextInt();
        System.out.print("GCD is:"+printGCD(x, y));

    }
}
