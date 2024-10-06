
import java.util.*;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n>0&& (n&(n-1))==0){
            System.out.print(n+" is a power of 2");
        }else{
            System.out.print(n+" is not power of 2");
        }
    }    
}
