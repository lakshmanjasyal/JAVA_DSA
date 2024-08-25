
import java.util.Scanner;

public class inverted180halfpyramid {
   public static void main(String[] args) {
      try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter rows:");
        int x=sc.nextInt();
        // System.out.print("Enter column:");
        // int y=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){ System.out.print(" ");}
            for(int j=1;j<=i;j++){ System.out.print("*");}
            System.out.println();
        }
      }
   } 
}
