import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int choice;

        do {
            System.out.println("Enter 1 to input marks or 0 to stop:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks. Please enter a number between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        } while (choice != 0);

        System.out.println("Program terminated.");
        sc.close();
    }
}
}

