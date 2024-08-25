
import java.util.Scanner;

public class Pascaltriangle {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=5;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){System.out.print(" ");}
        int number=1;
        for(int j=1;j<=i;j++){System.out.print(number +" ");
        number = number * (i - j) / j;}
        System.out.println();
       }
   } 
}
