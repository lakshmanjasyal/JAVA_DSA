
import java.util.Scanner;


public class towerOfHanoi {
    public static void printTower(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
            printTower(n-1, src, dest, helper);
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            printTower(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printTower(n, "A","B","C");

    } 
}
