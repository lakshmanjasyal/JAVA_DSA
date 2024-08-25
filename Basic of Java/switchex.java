
import java.util.Scanner;

public class switchex {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter the number:");
       int a=sc.nextInt();
        switch (a) {
            case 1: System.out.print("Hello");
            break;
            case 2:System.out.print("Namaste");
            break;
            case 3:System.out.print("Bonjour");
            break;
            default: System.out.print("Invalid Input");
        }
        sc.close();
   } 
}
