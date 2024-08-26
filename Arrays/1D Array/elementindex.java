
import java.util.Scanner;


public class elementindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the elements you want to find:");
        int x=sc.nextInt();
        System.out.print("Element is found at index ");
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){System.out.print(i);
            break;}
        }
        sc.close();
    }
}
