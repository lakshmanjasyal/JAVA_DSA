import java.util.*;

class infixtopost{

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
	
	private static String infixtopostfix(String exp){
		char[] result = new char[exp.length()];
		int resultindex=0;
		
		Stack stack = new Stack(exp.length());
		
		for(int i=0;i<exp.length();i++){
			char c = exp.charAt(i);
			if(isLetterorDigit(c)){
				result[resultindex++]=c;
			}
			else if(c=='('){
				stack.push(c);
			}
			else if(c==')'){
				while(!stack.isEmpty() && stack.peek()!='('){
					result[resultindex++]=stack.pop();
				}
				stack.pop();
			}
			else if(isOperator(c)){
				while(!stack.isEmpty() && precedence(c)<=precedence(stack.peek())){
					result[resultindex++]=stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()){
			result[resultindex++]=stack.pop();
		}
		return new String (result,0,resultindex);
	}
	
	public static void main(String[] args){
	String expr;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Infix String  : ");
	expr = sc.nextLine();
	
	String postfix = infixtopostfix(expr);
	System.out.println("Postfix : "+ postfix);
	}


}
















