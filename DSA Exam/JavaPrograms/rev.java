import java.util.*;

 class rev1{

	private char str[];
	private int top;
	private int max;
	
	rev1(int Size){
	max=Size;
	str =new char[max];
	top=-1;
	}
	
	public char pop(){
	
		char temp=str[top];		
			top--;
			return temp;
	
	
	}
	public void push(char item){
	
		top++;
		str[top]=item;
	}
	
	public boolean empty(){
		return top==-1;
	}
	}
	public class rev{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String st = sc.nextLine();
		rev1 r=new rev1(10);
		for(int i=0;i<st.length();i++){
		r.push(st.charAt(i));
		}
		System.out.println("Reverse String is ");
		while(!r.empty()){
		System.out.print(r.pop());
		}
		System.out.println();
		}
	
}
