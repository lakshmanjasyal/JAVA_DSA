
import java.util.Scanner;


public class multiplicationof2num{
    public static float calculateMul(float a,float b){
        float mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x:");
        float x=sc.nextFloat();
        System.out.print("Enter value of y:");
        float y=sc.nextFloat();
        float mul=calculateMul(x, y);
        System.out.print("The multiplication of "+x+" and "+y+" is "+ mul);

    }
}
