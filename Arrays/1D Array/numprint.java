
import java.util.*;


public class numprint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int number[]=new int[n];

        for(int i=0;i<n;i++){
        number[i]=sc.nextInt();}
        //Printing the array
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
