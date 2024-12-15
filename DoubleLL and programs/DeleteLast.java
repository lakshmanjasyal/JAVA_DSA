import java.util.*;

public class DeleteLast {
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
// deleteLast
public void deleteLast(){
    if(head==null){
        System.out.println("No element to delete");
        return;
    }
    if (head.next == null) {
        head = null;
        tail = null;
        return;
    }
    tail.prev.next=null;
    tail=tail.prev;

}
public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        DeleteLast list=new DeleteLast();
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
            list.deleteLast();
        }}
        list.display();
       }
}
}
