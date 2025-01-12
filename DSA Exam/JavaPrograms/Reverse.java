import java.util.*;

public class Reverse{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++){
		stack.push(str.charAt(i));
		}
		System.out.println("Reverse String is ");
		while(!stack.empty()){
		System.out.print(stack.pop());
		}
		System.out.println();
	}

}
