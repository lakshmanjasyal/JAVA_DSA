import java.util.*;

class parenthesis{


	public static	int top = -1;
	public static	int count =0;

	public static int count(String str){
		char[] stack = new char [str.length()];

		
		for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
		
		if(ch=='('||ch=='{'||ch=='['){
		top++;
		stack[top]=ch;
		
		}
		else if(ch==')'||ch=='}'||ch==']') 
		if(!isEmpty() && matcher(stack[top],ch)){
		top--;
		count++;
		}
		}
		return count;
	}
	
	public static boolean matcher(char open,char close){
	return ((open=='(' && close==')')||(open=='{' && close =='}')||(open=='[' && close==']'));
	}
	
	public static boolean isEmpty(){
	return top==-1;
	}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s= sc.nextLine();
	int number = count(s);
	System.out.println("Number of Valid Brackets "+ number);
	}

}

