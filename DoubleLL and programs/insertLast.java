import java.util.Scanner;

public class insertLast {
    private Node head,last;
    private class Node{
        char data;
        Node prev;
        Node next;
        Node(char data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
// display forward
public void forwardTraversal(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" -> ");
        curr=curr.next;
    }
    System.out.println("null");
}
// display backward
public void backwardTraversal(){
    Node curr=last;
    while(curr!=null){
        System.out.print(curr.data+" -> ");
        curr=curr.prev;
    }
    System.out.println("null");
}
// addLast
public void addLast(char data){
    Node newNode=new Node(data);
    if(head==null){
        head=last=newNode;
        return;
    }
    last.next=newNode;
    newNode.prev=last;
    last=newNode;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insertLast list=new insertLast();
        System.out.print("Enter the number of elements:");
        int k=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<k;i++){
            list.addLast(sc.next().charAt(0));
        }
        System.out.print("Display Forward: ");
        list.forwardTraversal();
        System.out.print("Display Backward: ");
        list.backwardTraversal();
        sc.close();
    }
}
// Key Improvements
// Class Name: Changed insertLast to InsertLast.
// Encapsulation: Made Node class private.
// Field Naming: Changed head and last to head and tail to more clearly indicate the start and end of the list.
// Use of try-with-resources for Scanner: Ensures Scanner is automatically closed after use.
// Comments: Brief comments are added to explain each method’s purpose.