import java.util.Scanner;

class deleteKey1{
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
    public void deleteAfterKey(int key){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
           if(currNode.data==key){
            if(currNode.next!=null){
                currNode.next=currNode.next.next;
                System.out.println("Element is found and the next node is deleted.");
            }else{
                System.out.println("Element is found, but no node exists after the key");
            }
            return;
           }
           currNode=currNode.next;
        }
       System.out.println("Element not found");
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         deleteKey1 list=new deleteKey1();
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
        list.deleteAfterKey(k);
        list.print();

    }
}