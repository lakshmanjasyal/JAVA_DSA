
import java.util.Scanner;

public class names {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of persons:");
        int x=sc.nextInt();
        String enterNames[] =new String[x];
        System.out.println("Enter the names of persons:");
        for(int i=0;i<x;i++){
            enterNames[i]=sc.nextLine();
        }
        System.out.println("Entered names are:");
        for(int i=0;i<enterNames.length;i++){
            System.out.println((i+1)+"."+enterNames[i]);
        }
        sc.close();
    }
}
