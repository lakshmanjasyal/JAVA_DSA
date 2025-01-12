import java.util.*;
class QLL{
  private Node head;
  private class Node{
	int data;
	Node next;
	Node(int data){
	this.data=data;
	this.next=null;}
}

// insertLast
public void Enqueue(int data){
  Node newNode=new Node(data);
  if(head==null){
	head=newNode;
	return;
	}
  Node curr=head;
  while(curr.next!=null){
	curr=curr.next;}
	curr.next=newNode;	
}
// deleteFirst
public void Dequeue(){
	if(head==null){
	System.out.println("Queue is empty");
	return;
	}
	System.out.println("Dequeued element is "+head.data);
	head=head.next;}
// Display
public void display(){
Node curr=head;
while(curr!=null){
System.out.print(curr.data+" --> ");
curr=curr.next;}
System.out.println("null");
}

public static void main(String[] args){
Scanner sc=new Scanner (System.in);
QLL list=new QLL();

while(true){
System.out.println("Enter the operation:\n1.Enqueue\n2.Dequeue\n3.Exit");
System.out.print("Enter the choice:");
int ch=sc.nextInt();
switch(ch){
case 1: System.out.print("Enter the element:");
	int m=sc.nextInt(); 
	list.Enqueue(m);
	list.display();
	break;
case 2: list.Dequeue();
	list.display();
	break;
case 3:System.out.print("Exiting...");
	return;
default:System.out.print("Enter valid option");	
}}}}
