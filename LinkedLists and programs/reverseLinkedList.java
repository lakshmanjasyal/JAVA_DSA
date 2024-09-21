import java.util.*;

class reverseLinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
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
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        if(head==null || head.next==null){
            System.out.println("No element to reverse");
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            //updation
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       reverseLinkedList list=new reverseLinkedList();
       System.out.print("Enter the number of Linked Lists:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            int elements=sc.nextInt();
            list.addLast(elements);
        }
        System.out.print("Before reversing:");
        list.print();
        System.out.print("After reversing:");
        list.reverse();
        list.print();

    }
}