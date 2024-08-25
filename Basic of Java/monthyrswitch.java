
import java.util.Scanner;

public class monthyrswitch {
   public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the month number:");
        int a=sc.nextInt();
        switch (a) {
            case 1 -> System.out.print("January");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("October");
            case 11 -> System.out.print("November");
            case 12 -> System.out.print("December");
            default -> System.out.print("Invalid Input");
        }
       }
   } 
}
