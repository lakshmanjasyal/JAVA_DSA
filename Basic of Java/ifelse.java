
import java.util.Scanner;

public class ifelse {
   public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the age of person " );
    int age=sc.nextInt();
    if(age>18){
        System.out.print("Adult");
    }
    else{
        System.out.println("Teenager");
    }
   } 
}
