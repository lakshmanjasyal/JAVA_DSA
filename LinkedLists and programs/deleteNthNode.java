import java.util.*;

class deleteNthNode{
    Node head;
    class Node{
        int data;
        Node next; 
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void print(){
        Node currNode =head;
        while(currNode!=null){
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public Node removeNthFromEnd(Node head, int n) {
    if(head.next==null) return null;
      int size=0;
      Node currNode=head;
      while(currNode!=null){
        currNode=currNode.next;
        size++;
      }
      if(n==size){
        return head.next;
      }
      int prevIndex=size-n;
      Node prevNode=head;
      int i=1;
      while(i<prevIndex){
        prevNode=prevNode.next;
        i++;
      }
      prevNode.next=prevNode.next.next;
      return head;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         deleteNthNode list=new deleteNthNode();
         System.out.print("Enter the number of Linked Lists:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            int elements=sc.nextInt();
            list.addLast(elements);
        }
        System.out.print("Enter the index from last:");
        int k=sc.nextInt();
        list.head = list.removeNthFromEnd(list.head, k);

        System.out.println("Updated Linked List:");
        list.print();
    }
}