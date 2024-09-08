
import java.util.Scanner;
public class age18{
    public static void printAge(int age){
        if(age>=18){System.out.print("Adult");}
        else{System.out.print("Minor");}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int x=sc.nextInt();
        printAge(x);
    }
}
