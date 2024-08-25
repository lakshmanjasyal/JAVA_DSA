
import java.util.Scanner;

public class tableofnum {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number you want the table:");
       int x=sc.nextInt();
       for(int i=1;i<=10;i++){
        System.out.println(x+"*"+i+"="+(x*i));
       }
   } 
}
