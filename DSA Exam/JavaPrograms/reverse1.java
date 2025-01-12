import java.util.*;

public class rev{

	public char str[];
	private int top=-1;
	
	public char pop(){
		char temp=str[top];
			System.out.println(temp);
			top--;
			System.out.print(temp);
			return temp;
	}
	public void push(char item){
		top++;
		str[top]=item;
	}
	
	public boolean empty(){
		return top==-1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		rev r=new rev();
		for(int i=0;i<str.length();i++){
		r.push(str.charAt(i));
		}
		System.out.println("Reverse String is ");
		while(!r.empty()){
		System.out.print(r.pop());
		
		}
		}
	
}
