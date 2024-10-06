
import java.util.Scanner;


public class countOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        String binaryString=Integer.toBinaryString(n);
        System.out.println("Binary String: "+binaryString);
        int countOnes = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                countOnes++;
            }
        }
        System.out.println("Number of 1's are "+ countOnes);
    }    
}
