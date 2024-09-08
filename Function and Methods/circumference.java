
import java.util.Scanner;
public class circumference {
    public static double  printcircumference(int r){
        return (2*Math.PI*r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius:");
        int x=sc.nextInt();
        System.out.print("The circumference of circle is "+printcircumference(x));

    }
}
