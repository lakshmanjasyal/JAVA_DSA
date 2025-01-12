import java.io.*;
import java.util.Stack;  // Import the Stack class from java.util

class prePost {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        try {
            System.out.print("Enter prefix : ");
            in = br.readLine();  // Read the prefix expression from user
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using the built-in Stack class from java.util
        Stack<String> stack = new Stack<>();
        char[] temp = in.toCharArray();  // Convert the input string to a char array

        // Traverse the prefix expression from right to left
        for (int i = in.length() - 1; i >= 0; i--) {
            char currentChar = temp[i];

            if (isOperator(currentChar)) {
                // Pop two operands from the stack
                String a = stack.pop();
                String b = stack.pop();
                
                // Combine them with the operator and push back to the stack
                stack.push(a + b + currentChar);
            } else {
                // If it's an operand, push it to the stack
                stack.push(String.valueOf(currentChar));
            }
        }

        // The final result is the only element left in the stack
        System.out.println("Postfix expression: " + stack.pop());
    }

    // Helper method to check if a character is an operator
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
}

