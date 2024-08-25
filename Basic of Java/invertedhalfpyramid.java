
import java.util.Scanner;



public class invertedhalfpyramid {
   public static void main(String[] args) {
      try( Scanner sc=new Scanner(System.in)){
        System.out.print("Enter value of x:");
        int x=sc.nextInt();
        System.out.print("Enter value of y:");
        int y=sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<y-i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
      }
   } 
}
