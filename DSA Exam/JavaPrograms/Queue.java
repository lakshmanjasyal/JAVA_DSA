import java.util.*;

class Node{

	int data;
	Node next;
	
	public Node(int data){
	this.data=data;
	this.next=null;
	
	}

}
class LinkedList{

	Node first;
	LinkedList(){
	first=null;
	}
	public void insertlast(int value){
	Node temp = first;
	Node ob= new Node(value);
	if(isEmpty()){
		first =ob;
	}
	else{
	while(temp.next!=null){
		temp=temp.next;
	}
		temp.next=ob;
	}
	}
	public void DeleteFirst(){
	
		if(isEmpty()){
		System.out.println("LInk list is Empty ");
		}
		else{
		first=first.next;
		}
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void display(){
	Node refer = first;
	while(refer!=null){
		System.out.println(refer.data);
		refer=refer.next;
	}
	}
}

public class Queue{
	
	public static void main(String[] args){
	LinkedList link = new LinkedList();
	Scanner sc = new Scanner(System.in);
	while(true){
	System.out.println("\n 1. Insertatlast \n 2.DeleteFirst \n 3.Exit\n");
	System.out.println("Enter your Choice - ");
	int l = sc.nextInt();
	switch(l){
		case 1:
			System.out.println("Enter value : ");
			int n = sc.nextInt();
			link.insertlast(n);
			System.out.println();
			link.display();
			System.out.println();
			break;
		
		case 2:
			link.DeleteFirst();
			System.out.println();
			link.display();
			System.out.println();
			break;
			
		
		
		
		case 3:
			System.out.println("Exiting Program............");
			System.exit(0);
			break; 
			
			
		default:
			System.out.println("Wrong Entry");
			break;
	}
		
	}
	
	}
}



