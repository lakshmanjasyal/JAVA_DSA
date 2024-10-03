
import java.util.Scanner;

public class bubblesort {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number of elements of array:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.print("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sorted Array is: ");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
        printArray(arr);
   } 
}
