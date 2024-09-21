
import java.util.*;

class middle{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int n){
            this.data=n;
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
        if(head==null){System.out.println("List is empty");}
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void printMiddle(){
        int count=0;
        Node currNode1=head;
        while(currNode1!=null){
            currNode1=currNode1.next;
            count++;
        }
        int k=(count/2);
        Node currNode2=head;
        for(int i=0;i<k;i++){currNode2=currNode2.next;}
        System.out.print("Middle element:"+currNode2.data);
    }
    // public void printMiddle() {
    //     if (head == null) {
    //         System.out.println("List is empty");
    //         return;
    //     }
    //     Node slow = head;
    //     Node fast = head;

    //     // Move slow by one and fast by two until fast reaches the end
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     // When fast reaches the end, slow will be at the middle
    //     System.out.println("Middle element: " + slow.data);
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        middle list=new middle();
        System.out.print("Enter the number of elements of Linked Lists:");
        int n=sc.nextInt();
        System.out.print("Enter the elements of Linked Lists:");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            list.addLast(element);
        }  
        list.print(); 
        list.printMiddle();
    
    }
}