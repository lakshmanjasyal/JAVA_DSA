
import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Operation 1: Set\nOperation 2: Clear");
        int op=sc.nextInt();

        int n=5;
        int pos=1;
        int bitMask=1<<pos;

        if(op==1){ // Set
            int newNum=bitMask |n;
            System.out.println(newNum);
        }
        else{// Clear
            int change=~(bitMask);
            int newNum2=change &n;
            System.out.println(newNum2);

        }
       
    }    
}
 // // clearing the bit(1 to 0)
        // int change=~(bitMask);
        // int newNum=change&n;
        // System.out.println(newNum);

        // // changing 0 to 1
        // int newNum2=newNum|n;
        // System.out.println(newNum2);
