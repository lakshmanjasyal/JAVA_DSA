import java.util.*;

public class insertionSort {
    public static void printArray(int arr[]){
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

        System.out.print("Sorted Array is ");
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
                while(j >= 0 && arr[j] > current) {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
            arr[j+1] = current;
        }
        printArray(arr);
 
}
}
