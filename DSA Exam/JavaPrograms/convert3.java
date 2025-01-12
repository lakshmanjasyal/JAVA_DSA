import java.util.*;

class PostfixToPrefix {


    public static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    
    public static String convertPostfixToPrefix(String postfix) {
        
        String[] stack = new String[postfix.length()];
        int top = -1;

        
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
                top++;
                stack[top] = String.valueOf(ch);
            }
          
            else if (isOperator(ch)) {
  
                String operand2 = stack[top];
                top--;
                String operand1 = stack[top];
                top--;

                
                String prefix = ch + operand1 + operand2;
                top++;
                stack[top] = prefix;
            }
        }


        return stack[top];
    }
}

class convert3{

    public static void main(String[] args){
    	Scanner sc= new Scanner(System.in);
        String postfixExpression;
        System.out.println("Enter the String : ");
        postfixExpression = sc.nextLine();
        PostfixToPrefix ll = new PostfixToPrefix();
        String prefixExpression = ll.convertPostfixToPrefix(postfixExpression);
        System.out.println("Postfix Expression: " + postfixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}

