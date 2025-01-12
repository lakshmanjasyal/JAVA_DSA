import java.util.*;

class Node{

	char data;
	Node next;
	Node prev;
	
	public Node(char data){
	this.data=data;
	this.next=null;
	this.prev=null;
	
	}

}
class Doublelink{

	Node first;
	Node tail;
	
	Doublelink(){
	first=null;
	tail=null;
	}
	
	public void append(char value){
	
	Node ob= new Node(value);
	Node temp=first;
	if(first==null){
		first =ob;
		tail=ob;
	}
	else{
		tail.next=ob;
		ob.prev=tail;
		tail=ob;
	}
	
	}
	
	public void Compare(){
		
		int count=0;
		Node head = first;
		Node end = tail;
		while(head!=end){
			if(head.data!=end.data){
				count++;
			}
			head=head.next;
			end=end.prev;
			
		}
		
		if(count>0){
		System.out.println(" is not  Pallindrome ");
		}
		else{
		System.out.println("is  Pallindrome ");
		}
	}

}
class pallindrome{
	public static void main(String[] args){
		Doublelink dlink = new Doublelink();
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		for(int i=0;i<string.length();i++){
			char ch = string.charAt(i);
			dlink.append(ch);
		}
		dlink.Compare();
	}
}
