import java.util.*;

public class stackarray{

	private int max;
	private int top;
	private int arr[];
	
	public stackarray(int s){
		max=s;
		top=-1;
		arr =new int[max];	
	}
	
	public void push(int item){
		if(top<max){
			top++;
			arr[top]=item;
		}
		else{
			System.out.println("Array is Full");
		}
		
	}
	
	public void pop(){
		if(top>=0){
			int temp=arr[top];
			System.out.println(temp);
			top--;
		}
		else{
			System.out.println("Array is Empty ");
		}
	}
	public void peek(){
	
		System.out.println(arr[top]);
	}
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size of Array : ");
	int size =sc.nextInt();
	stackarray s=new stackarray(size);
	while(true){
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.println("3.Peek");
		System.out.println("4.Exit");
		System.out.println("Enter your Choice : ");
		int option =sc.nextInt();
		switch(option){
		
			case 1:
				System.out.println("Enter the Element You want to Push ");
				int item1 =sc.nextInt();
				s.push(item1);
				break;
				
			case 2:
				System.out.println("Poped element is ");
				s.pop();
				break;
				
			case 3:
				System.out.println("The Top Element is ");
				s.peek();
				break;
				
			case 4:
				System.exit(0);
				break;
		
		}
		}
	}

}
