
import java.util.Scanner;


public class ascendingorder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }
 
    }
}
