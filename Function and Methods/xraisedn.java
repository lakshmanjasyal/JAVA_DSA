
import java.util.Scanner;


public class xraisedn {
    public static void printraised(int x,int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*x;
        }
        System.out.print(x+" raised to "+n+"="+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x:");
        int x=sc.nextInt();
        System.out.print("Enter the y:");
        int y=sc.nextInt();
        printraised(x, y);
    }
}
