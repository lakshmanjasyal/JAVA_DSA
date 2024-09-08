
import java.util.Scanner;


public class Tableofnum {
    public static void printTable(int n){
        for(int i=1;i<=20;i++){System.out.println(n+"*"+i+"="+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int x=sc.nextInt();
        System.out.println("The table of "+x+" is given below:");
        printTable(x);
    }
}
