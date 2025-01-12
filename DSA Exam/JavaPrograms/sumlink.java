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

	Node head;
	
	public void append(int value){
	
		Node ob= new Node(value);
		if(head==null){
			head =ob;
		}
		else{
			Node curr = head;
			while(curr.next!=null){
				curr = curr.next;
			}
			curr.next=ob;
		}
	}
	
	public int sumof(){
		int sum=0;
		Node curr = head;
		while(curr!=null){
		sum +=curr.data;
		curr=curr.next;
		}
		return sum;
	}
	public int singledigit(int sum){
		int newsum=0;
		while (sum>=10){
			
			while(sum!=0){
			newsum+=sum%10;
			sum=sum/10;
			}
		}
		return newsum;
	}
	}
class sumlink{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		LinkedList list = new LinkedList();
		
		while(num>0){
			list.append(num%10);
			num=num/10;
		}
		int result = list.singledigit(list.sumof());
		System.out.println("the Single Digit Sum is "+result);
	}	
	
	}
	



