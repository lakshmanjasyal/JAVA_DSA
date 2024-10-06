
import java.util.Scanner;


public class toggleBitposition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.print("Enter pos i.e.position bit:");
        int pos=sc.nextInt();
        int bitMask=1<<pos;

       int newNum=n^bitMask;
       System.out.println("New number after toggling the bit at position " + pos + ": " + newNum);
    }    
}
 // int getBit=bitMask & n;
        // System.out.println("Bit at position bit:"+getBit);
        // if(getBit==1){
        //     // clear change 1 to 0
        //     int change=~(bitMask);
        //     int newNum2=change&n;
        //     System.out.println(newNum2);
            
        // }else{// change to 1
        //     int newNum1=bitMask|n;
        //     System.out.println(newNum1);
        // }