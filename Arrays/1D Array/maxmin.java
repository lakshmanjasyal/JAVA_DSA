
import java.util.*;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int x=sc.nextInt();
        int arr[]=new int[x];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
