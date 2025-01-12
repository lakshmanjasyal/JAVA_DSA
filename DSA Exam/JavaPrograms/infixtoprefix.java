import java.util.*;

class infixtoprefix{

	static class Stack{
	
	private int max;
	private int top;
	private char arr[];
	
	public Stack(int s){
		max=s;
		top=-1;
		arr =new char[max];	
	}
	
	public void push(char item){
		if(top<max){
			top++;
			arr[top]=item;
		}
		else{
			System.out.println("Array is Full");
		}
		
	}
	
	public char pop(){
		if(top>=0){
			return(arr[top--]);
		}
		return '\0';
	}
	public char peek(){
		if(top!=-1){
			return(arr[top]);
		}
		return '\0';
	
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean isFull(){
		return top==max-1;
	}
	}
	
	static String reverse(String exp){
		char [] chars = exp.toCharArray();
		int n = exp.length();
		for(int i=0;i<n/2;i++){
			char temp = chars[i];
			chars[i]=chars[n-i-1];
			chars[n-i-1]=temp;
			
		}
		return new String(chars,0,n);
	}
	
	
	
	private static boolean isLetterorDigit(char c){
		return(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9');
	}
	
	
	private static boolean isOperator(char ch){
		return(ch=='+' || ch=='-' || ch=='*' || ch=='/');
	}
	private static int precedence(char c){
	switch(c){
	
	case '+':
	case '-':
		return 1;
	case '*':
	case '/':
		return 2;
	case '^':
		return 3;
	
	}
	return -1;
	}
	
	private static String infixtopref(String exp){
		
		 char[] stack = new char[exp.length()];
		int top = -1;
		StringBuilder postfix = new StringBuilder();

		
		for (int i = 0; i < exp.length(); i++) {
		    char ch = exp.charAt(i);

		    if (isLetterorDigit(ch)) {
		        postfix.append(ch); 
		    } else if (ch == '(') {
		        stack[++top] = ch;  
		    } else if (ch == ')') {
		        
		        while (top != -1 && stack[top] != '(') {
		            postfix.append(stack[top--]);
		        }
		        top--;  
		    } else if (isOperator(ch)) {
		    
		        while (top != -1 && precedence(stack[top]) >= precedence(ch)) {
		            postfix.append(stack[top--]);
		        }
		        stack[++top] = ch; 
		    }
		}

		
		while (top != -1) {
		    postfix.append(stack[top--]);
		}

		return postfix.toString();
	}

	
	public static void main(String[] args){
	String expr;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Infix String  : ");
	expr = sc.nextLine();
	
	String iniprefix = infixtopref(expr);
	
	System.out.println("Prefix : "+ iniprefix);
	}


}
















