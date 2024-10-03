
import java.util.Scanner;


public class sumNNaturalnumber {
    public static void printNSum(int n,int sum){
      if(n==0){
        System.out.print(sum);
        return;
      }
      sum+=n;
      printNSum(n-1,sum);
    //   System.out.println(n-1);
    }
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter the natural number:");
        int x=sc.nextInt();
        printNSum(x,0);
  }
}
