import java.util.*;

 class rev1{

	private char str[];
	private int top;
	private int max;
	
	rev1(int Size){
	max=Size;
	str =new char[max];
	top=0;
	}
	
	public void count(char item,String string){
		for(int i=0;i<string.length();i++){
		if(item==')'||item=='(')
		top++;
		}
		System.out.println("Number of Parenthesis is "+ top);
	
	}
	
	
	
	}
	public class stringmatch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String st = sc.nextLine();
		rev1 r=new rev1(10);
		for(int i=0;i<st.length();i++){
		r.count(st.charAt(i),st);
		}
	
		System.out.println();
		}
	
}


