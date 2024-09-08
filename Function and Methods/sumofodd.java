
import java.util.Scanner;


public class sumofodd {
    public static void printOddSum(int n){
        float sum=0;
        for(int i=n;i>=1;i--){
            if(i%2!=0){System.out.print(i+" ");
            sum+=i;}
        }
        System.out.print("\nThe sum of Odd numbers is "+ sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int x=sc.nextInt();
        System.out.print("The Odd numbers in given range is ");
        printOddSum(x);
    }
}
