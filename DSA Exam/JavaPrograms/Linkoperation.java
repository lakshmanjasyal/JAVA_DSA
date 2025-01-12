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
	
	public void insertfirst(int value){
	
	Node ob= new Node(value);
	if(isEmpty()){
		first =ob;
	}
	else{
		ob.next=first;
		first=ob;
	}
	System.out.println("Inserted "+value +" at First");
	
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
	
	public void insertlast(int value){
	Node temp = first;
	Node ob= new Node(value);
	while(temp.next!=null){
		temp=temp.next;
	}
		temp.next=ob;
	}
	
	public void insertafterkey(int key,int d){
	
		Node ob =new Node(d);
		
		
		Node find =first;
	while(find!=null){
		if(find.data==key){
		System.out.println("Key is Present ");
		ob.next = find.next;
		find.next= ob;
		break;
		}
		else{
			find=find.next;
		}
	}
	if(find==null){
		System.out.println("Key is not Present ");
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
	
	public void DeleteLast(){
	
		if(isEmpty()){
			System.out.println("Link  is Empty ");
		}
		else{
			Node temp=first;
			Node prev=null;
			while(temp.next!=null){
				
				prev=temp;
				temp=temp.next;
			
			}
			
			prev.next=null;			
		}
	}
	
	public void Deleteafter(int key){
	
	Node curr = first;
	while(curr!=null && curr.data!=key){
		curr=curr.next;
	}
	
	if(curr!=null && curr.next==null){
	System.out.println("There exist no node after the key");
	}
	else if(curr!=null  && curr.data==key){
		curr.next=curr.next.next;
	}
		
	}
	
	public int Finderkey(int key){
	
	Node curr =first;
	int pos=0;
	
	while(curr!=null){
		if(curr.data==key){
		return pos;
		}
		curr=curr.next;
		pos++;
	}
	return -1;
}
}

class Linkoperation{
	
	public static void main(String[] args){
	LinkedList link = new LinkedList();
	Scanner sc = new Scanner(System.in);
	
	while(true){
	System.out.println("\n 1. Insertatfirst \n 2.InsertLast \n 3.Insertafterkey \n 4.DeleteFirst \n 5.DeleteLast \n 6.Deleteafterkey \n 7.Search Element\n 8.Exit\n");
	System.out.println("Enter your Choice - ");
	int l = sc.nextInt();
	switch(l){
		case 1:
			System.out.println("Enter value : ");
			int number = sc.nextInt();
			link.insertfirst(number);
			System.out.println();
			link.display();
			System.out.println();
			break;
		case 2:
			System.out.println("Enter value : ");
			int n = sc.nextInt();
			link.insertlast(n);
			System.out.println();
			link.display();
			System.out.println();
			break;
			
		case 3:
			System.out.println("Enter value : ");
			int x = sc.nextInt();
			System.out.println("Enter key afetr  you want to add : ");
			int y= sc.nextInt();
			link.insertafterkey(y,x);
			System.out.println();
			link.display();
			System.out.println();
			break;
			
		case 4:
			link.DeleteFirst();
			System.out.println();
			link.display();
			System.out.println();
			break;
			
		case 5:
			link.DeleteLast();
			System.out.println();
			link.display();
			System.out.println();
			break;
			
		case 6:
			System.out.println("Enter key after  you want to delete : ");
			int w= sc.nextInt();
			
			link. Deleteafter(w);
			System.out.println();
			link.display();
			System.out.println();
		
			break;
			
			
			
		case 7:
			System.out.println("Enter value to be Searched : ");
			int s = sc.nextInt();
			if(link.Finderkey(s)!=-1){
				System.out.println("The Positon of the element is "+link.Finderkey(s));
			}
			else{
				System.out.println("Element not present  ");
			}
			
			break;
		
		
		case 8:
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

