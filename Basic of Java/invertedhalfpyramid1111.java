
import java.util.Scanner;

public class invertedhalfpyramid1111 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=5;
       int num=1;
       for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            
            System.out.print(num);
        }
        System.out.println();
        num++;
       }
   } 
}
