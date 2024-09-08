
import java.util.Scanner;


public class sumof2num {
    public static float sumOfTwoNum(float a,float b){
        float sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x:");
        float x=sc.nextFloat();
        System.out.print("Enter value of y:");
        float y=sc.nextFloat();
        float sum=sumOfTwoNum(x, y);

        System.out.print("The sum of "+x+" and "+y+" is "+sum);
        sc.close();
    }
}
