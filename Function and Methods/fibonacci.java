
import java.util.Scanner;
public class fibonacci {
    public static void printFibonacci(int n){
        int a=0;
        int b=1;
        System.out.print(a+" ");
        for(int i=1;i<=n;i++){
            System.out.print(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
        }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the upper limit:");
    int x=sc.nextInt();
    System.out.println("The series would be:");
    printFibonacci(x);

}
}