import java.io.*;
import java.util.Stack; // Import the Stack class from java.util

class infpre {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        try {
            System.out.print("Enter infix : ");
            in = br.readLine();  // Read the infix expression from user
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stack<String> stack = new Stack<>();  // Using the built-in Stack class
        String out = "";
        char[] temp = in.toCharArray();  // Convert the input string to a char array

        // Iterate over the characters in reverse order
        for (int i = in.length() - 1; i >= 0; i--) {
            System.out.println(out); // Print the output for each iteration (debugging)

            switch (temp[i]) {
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':
                    // Process operators
                    while (!stack.isEmpty() && operatorValue(stack.peek()) > operatorValue(String.valueOf(temp[i]))) {
                        out = stack.pop() + out; // Pop and add to the output
                    }
                    stack.push(String.valueOf(temp[i]));  // Push the current operator onto the stack
                    break;
                case ')':
                    stack.push(String.valueOf(temp[i]));  // Push closing parenthesis onto stack
                    break;
                case '(':
                    // Process until finding matching closing parenthesis
                    while (!stack.peek().equals(")")) {
                        out = stack.pop() + out;  // Pop and add to the output
                    }
                    stack.pop();  // Remove the closing parenthesis
                    break;
                default:
                    // Add operands (numbers or variables) directly to the output
                    out = temp[i] + out;
                    break;
            }
        }

        // Pop all remaining operators in the stack
        while (!stack.isEmpty()) {
            out = stack.pop() + out;
        }

        System.out.println("Prefix expression: " + out);  // Final result
    }

    // Method to define precedence of operators
    static int operatorValue(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 0;
            case "*":
            case "/":
                return 1;
            case "^":
                return 2;
            default:
                return -1;
        }
    }
}

