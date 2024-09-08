
import java.util.Scanner;


public class nogreaterthaninputs {
    public static void printGreater(int a,int b){
        if(a>b){ System.out.print(a);}
        else{System.out.print(b);}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int x=sc.nextInt();
        System.out.print("Enter the value of y:");
        int y=sc.nextInt();
        System.out.print("The number greater than given inputs ");
        printGreater(x, y);
    }
}
