import java.util.*;
public class reverserecurLL {
    Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }
// addLast

        public void addLast(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
// printList
        public void printList(){
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode=currNode.next;
            }
            System.out.println("null");
        }
public Node reverseRecursive(Node head){
    if(head==null||head.next==null){
        return head;
    }
    Node newHead=reverseRecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newHead;
}

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       reverserecurLL list =new reverserecurLL();
       System.out.print("Enter the number of elements:");
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
        int element=sc.nextInt();
        list.addLast(element);
       }
       list.printList();
       list.head=list.reverseRecursive(list.head);
       list.printList();
   } 
}
