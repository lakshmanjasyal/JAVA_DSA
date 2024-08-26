
import java.util.Scanner;



public class transposematrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The transpose of matrix is:");
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
            System.out.print(arr[j][i]+" ");                
            }
            System.out.println();
        } 
    }
}
