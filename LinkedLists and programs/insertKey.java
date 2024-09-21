import java.util.Scanner;

class insertKey{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void print(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void insertBeforeKey(int key,int data){
        Node newNode=new Node(data);
        if(head.data==key){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            if(currNode.data==key){
                System.out.println(key+" is found");
                newNode.next=prevNode.next;
                prevNode.next=newNode;
            }
            prevNode=currNode;
            currNode=currNode.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insertKey list=new insertKey();
        System.out.print("Enter the number of Linked Lists:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            int elements=sc.nextInt();
            list.addFirst(elements);
        }
        list.print();
        System.out.print("Enter the key:");
        int k=sc.nextInt();
        System.out.print("Enter inserting element:");
        int m=sc.nextInt();
        list.insertBeforeKey( k, m);
        list.print();
    }
}