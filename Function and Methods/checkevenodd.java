
import java.util.Scanner;


public class checkevenodd {
    public static void printEvenOdd(int n){
        if(n%2==0){System.out.print(n+" is a even number");}
        else{System.out.print(n+" is a odd number");}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int x=sc.nextInt();
        printEvenOdd(x);
    }
}
