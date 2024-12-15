import java.util.*;
public class DeleteFirst {
    private Node head,tail;
    private class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
// display
public void display(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" <-> ");
        curr=curr.next;
    }
    System.out.println("null");
}
// addLast
public void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.prev=tail;
    tail.next=newNode;
    tail=newNode;
}
// deleteFirst
public void deleteFirst(){
    if(head==null){
        System.out.println("Linked List is empty.");
        tail=null;
        return;
    }
    if (head.next == null) { // Only one node in the list
        head = null;
        tail = null;
        return;
    }
    head=head.next;
    head.prev=null;
}
    public static void main(String[] args) {
       try(Scanner sc=new Scanner(System.in)){
        DeleteFirst list=new DeleteFirst();
        System.out.print("Enter the number of elements:");
        int k=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<k;i++){
            list.addLast(sc.nextInt());
        }
        list.display();
        System.out.print("Enter the number of elements you want to delete:");
        int l=sc.nextInt();
    
        if(l>k){
            System.out.print("Not able to delete,Enter in range:");
        }else{
            System.out.print("After deleting:");
        for(int i=0;i<l;i++){
            list.deleteFirst();
        }}
        list.display();
       }
    }
}
