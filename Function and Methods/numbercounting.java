import java.util.Scanner;
public class numbercounting {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Press 1 to continue & 0 to stop:");
        int input = sc.nextInt();
        
        while (input == 1) {
            System.out.print("Enter your number:");
            int number = sc.nextInt();
            
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
            
            System.out.print("Press 1 to continue & 0 to stop:");
            input = sc.nextInt();
        }
        
        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeros: " + zeros);
        
        sc.close();
}
}
