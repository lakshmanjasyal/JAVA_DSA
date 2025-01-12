
import java.util.*;

public class stackUsingLL{
    Node head;
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

// Empty
    public boolean isEmpty(){
        return head==null;
    }

// Push()
    public void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
// Pop()
    public void pop(){
        if(isEmpty()){
            System.out.println("No element in the list ");
            return;
        }
        int top=head.data;
        System.out.println("Deleted element:"+top);
        head=head.next;
    }
// Peek()
    public void peek(){
        if(isEmpty()){
            System.out.println("No head!");
            return;
        }
        System.out.println("Top element:"+head.data);
    }
// Display()
    public void Display(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" --> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stackUsingLL list=new stackUsingLL();
        System.out.print("Enter reference variable:");
        int ref=sc.nextInt();
        list.push(ref);
        System.out.print("Before operations:");
        list.Display();
        while (true) { 
         System.out.println("Enter the operation:\n1.Push\n2.Pop\n3.Peek\n4.Display");
         int choice=sc.nextInt();
         switch(choice) {
            case 1: System.out.print("Enter element:");
                    int m=sc.nextInt();
                    list.push(m);
                    list.Display();
                    break;
            case 2: list.pop();
                    list.Display();
                    break;
            case 3: list.peek();
                    list.Display();
                    break;
            case 4: list.Display();
                    break;
            default:System.out.println("Enter valid input!");
                break;
         }   
        }}
    }
