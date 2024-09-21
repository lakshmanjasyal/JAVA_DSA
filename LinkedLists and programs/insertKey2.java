import java.util.Scanner;

class insertKey2{
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
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void insertAfterKey(int key,int data){
        Node newNode=new Node(data);
        if(head.data==key){
            newNode.next=head.next;
            head.next=newNode;
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            if(currNode.data==key){
                System.out.println("Element is found!");
                newNode.next=currNode.next;
                currNode.next=newNode;
            }
            currNode=currNode.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        insertKey2 list=new insertKey2();
        System.out.print("Enter the number of Linked Lists:");
        int n=sc.nextInt();
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            int elements=sc.nextInt();
            list.addLast(elements);
        }
        list.print();

        System.out.print("Enter the key:");
        int k=sc.nextInt();
        System.out.print("Enter inserting element:");
        int m=sc.nextInt();
        list.insertAfterKey(k, m);
        list.print();
    }
}