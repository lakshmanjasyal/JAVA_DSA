import java.util.*;
public class insertFirst{
    Node head,last;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
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
// addFirst
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=last=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insertFirst list=new insertFirst();
        System.out.print("Enter the number of elements to enter:");
        int k=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<k;i++){
            list.addFirst(sc.nextInt());
        }
        System.out.print("Display Forward:");
        list.forwardTraversal();
        System.out.print("Display Backward:");
        list.backwardTraversal();
    }
}
//  mistake
// In the addFirst method, you are only updating the head when a new node is added at the beginning,
//  but you're not updating the last reference if it's the first insertion. Thus, last remains 
//  pointing to the first node added (which becomes the end of the list after all insertions).