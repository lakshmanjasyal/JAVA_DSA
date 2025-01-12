import java.util.*;

class Queue{

	private int max;
	private int rear;
	private int arr[];
	private int front;
	
	public Queue(int s){
		max=s;
		rear=-1;
		arr =new int[max];
		front = 0;	
	}
	
	public void insert(int item){
		if(isEmpty()){
			rear = rear+1;
			arr[front] = item;
			arr[rear] = item;
		}
		else if(isFull()){
			System.out.println("Queue is Full........  ");
		}
		else{
		rear = (rear+1)%max;
		arr[rear] = item;
		}
	}
	public void del(){
		int item = arr[front];
		front = (front+1)%max;
		System.out.println("Deleted item : "+item);
	}
	public boolean isEmpty(){
		return (rear+1)%max == front;
	}
	
	public boolean isFull(){
		return(rear+2)%max == front;
	}
	public void peek(){
	
		System.out.println("Top Element : "+arr[front]);
	}
	public void display(){
	int ref = front;
	while((rear+1)%max!=ref){
		System.out.print(arr[ref]+"<-");
		ref++;
	}
	System.out.println();
	}
}
	
	public class circularqueue{
	
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Size of Array : ");
	int size =sc.nextInt();
	Queue s=new Queue(size);
	while(true){
		System.out.println("1.NQueue");
		System.out.println("2.DQueue");
		System.out.println("3.Peek");
		System.out.println("4.Exit");
		System.out.println("Enter your Choice : ");
		int option =sc.nextInt();
		switch(option){
		
			case 1:
				System.out.println("Enter the Element You want to Insert ");
				int item1 =sc.nextInt();
				s.insert(item1);
				s.display();
				break;
				
			case 2:
				System.out.println("Poped element is ");
				s.del();
				s.display();
				break;
				
			case 3:
				System.out.println("The Top Element is : ");
				s.peek();
				break;
				
			case 4:
				System.exit(0);
				break;
		
		}
		}
	}

}


