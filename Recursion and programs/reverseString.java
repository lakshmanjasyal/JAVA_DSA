
import java.util.Scanner;

public class reverseString {
    public static void printrev(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str, idx-1);
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String stx=sc.nextLine();
        System.out.print("The reverse of "+stx+" is  ");
        printrev(stx, stx.length()-1);
   } 
}
