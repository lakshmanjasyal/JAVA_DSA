
import java.util.Scanner;

public class invertedpyramidwithnum {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=5;
      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++)
        {
            System.out.print(j+" ");
        }
       System.out.println();
      }
// // In this code extra line will be printed because it starts with 0 till n overall its jugadu method
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=(n-i+1);j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//     }
  } 
}
