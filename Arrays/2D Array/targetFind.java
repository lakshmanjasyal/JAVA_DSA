
import java.util.Scanner;


public class targetFind {
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
        System.out.print("Enter the target element you want the indices:");
        int x=sc.nextInt();
        boolean found=false;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr[i][j]==x)
                {
                    if (!found) {
                        System.out.println("The target element is found at index:");
                        found = true;
                    }
                    System.out.print("["+i+j+"]");
                }
            }
        }
        if(!found){
            System.out.print("Target element not found in array.");
        }
    }
}
