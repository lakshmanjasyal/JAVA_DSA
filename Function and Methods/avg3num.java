
import java.util.Scanner;


public class avg3num {
    public static float printAverage(float a,float b,float c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st value:");
        float x=sc.nextFloat();
        System.out.print("Enter 2nd value:");
        float y=sc.nextFloat();
        System.out.print("Enter 3rd value:");
        float z=sc.nextFloat();
        System.out.print("The average of these numbers is "+printAverage(x, y, z));
        
    }
}
