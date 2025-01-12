import java.util.*;
public class linkedListOperation{
    Node head;
    class Node{
    int data;
    Node next;
    Node(int data){
    this.data=data;
    this.next=null;}
    }
// Add First method
public void addFirst(int data){
Node newNode=new Node(data);
if(head==null){
System.out.println("List is empty");
return;}
newNode.next=head;
head=newNode;
}
// Add Last method
public void addLast(int data){
Node newNode=new Node(data);
if(head==null){
head=newNode;
return;}
Node curr=head;
while(curr.next!=null){
curr=curr.next;
}
curr.next=newNode;
}
// Delete Firstnode method
public void deleteFirst(){
if(head==null){System.out.println("List is empty"); return;}
head=head.next;
}

// Delete Lastnode method   
public void deleteLast(){
if(head==null){System.out.println("List is empty"); return;}
if(head.next==null){head=head.next;}

Node prev=head;
Node curr=head.next;
while(curr.next!=null){
prev=curr;
curr=curr.next;
}
prev.next=null;
}

// Display
public void display(){
Node curr=head;
while(curr!=null){
System.out.print(curr.data+" --> ");
curr=curr.next;}
System.out.println("null");
}
// Finding key
public void findKey(int key){
if(head.data==key){
System.out.print("Key is found at 0"); return;}
Node curr=head;
int count=0;
while(curr!=null){
	if(curr.data==key){
	System.out.print("Key is found at index "+count);
	return;}
	count++;
	curr=curr.next;	
}
if(curr==null){System.out.print("Element is not int the list"); return;}
}   

public void insertSpecific(int index,int data){
Node newNode=new Node(data);
Node curr=head;
for(int i=0;i<index-1;i++){
   curr=curr.next;
}
newNode.next=curr.next;
curr.next=newNode;
}    

// Delete Key
public void deleteKey(int key){
Node prev=head;
Node curr=head.next;
if(head.data==key){
head=head.next;}
while(curr!=null){
	if(curr.data==key){
	prev.next=curr.next;
	return;
	}
 prev=curr;
 curr=curr.next;
}
}
    
public static void main(String[] args){
Scanner sc=new Scanner (System.in);
linkedListOperation list=new linkedListOperation();
System.out.println("Enter the size of linked list:");
int size=sc.nextInt();
System.out.print("Enter the elements of linked list:");
for(int i=0;i<size;i++){
int element=sc.nextInt();
 list.addLast(element);
}
System.out.print("Before performing operations:");
list.display();
while(true){
System.out.println("Choose an operation:\n1.Insert First\n2.Insert Last\n3.Delete First\n4.Delete Last\n5.Key\n6.Insert Specific\n7.Delete Key");
System.out.print("Enter the choice:");
int choice=sc.nextInt();
switch(choice){
case 1: System.out.print("Enter the element:");
	int m=sc.nextInt(); 
	list.addFirst(m);
	list.display();
	break;
case 2: System.out.print("Enter the element:");
	int n=sc.nextInt(); 
	list.addLast(n);
	list.display();
	break;
case 3: list.deleteFirst();
	list.display();
	break;
case 4: list.deleteLast();
	list.display();
	break;
case 5: System.out.print("Enter the key:");
	int key=sc.nextInt();
	list.findKey(key);
	break;
case 6: System.out.print("Enter the element:");
	int o=sc.nextInt();
	System.out.print("Enter the index:");
	int index=sc.nextInt();
	list.insertSpecific(index,o);
	list.display();
	break;
case 7: System.out.print("Enter the key:");
	int key1=sc.nextInt();
	list.deleteKey(key1);
	list.display();
default:System.out.print("Enter valid option");	

}

}
}
}
