import java.util.Scanner;

class deleteBeforeKey{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
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
    public void delete(int key){
        if(head.data==key){
            System.out.println("No element to delete before key!");
            return;
        }
        if (head.next != null && head.next.data == key) {
            head=head.next;
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        Node nextNode=currNode.next;
        while(nextNode!=null){
            if(nextNode.data==key){
                prevNode.next=currNode.next;
                return;
            }
            prevNode=currNode;
            currNode=nextNode;
            nextNode=nextNode.next;
        }
        System.out.println("Key not found in the list!");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        deleteBeforeKey list=new deleteBeforeKey();
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
        System.out.println("After deleting before key:");
        list.delete(k);
        list.print();
    }
}
