
import java.util.Scanner;

public class halfpyramid {
   public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
        System.out.print("Enter the number of rows:");
        int x=sc.nextInt();
        System.out.print("Enter the number of columns:");
        int y=sc.nextInt();

        // for(int i=x;i>=1;i--){
        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                if(j<=i){
                System.out.print("*");}
            }
            System.out.println();
        }
       }

   } 
}
