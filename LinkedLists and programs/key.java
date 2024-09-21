
import java.util.Scanner;

class key{
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
        if(head==null){System.out.println("List is empty");}
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void findKey(int key){
        if(head==null){System.out.println("List is empty");}
        Node currNode=head;
        int index=0;
        while(currNode!=null){
            if(currNode.data==key){
                System.out.println("Element is found at "+index);
                break;
            }
            currNode=currNode.next;
            index++;
        }

        if(currNode.data!=key){
            System.out.println("Not found!");
        }
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        key list=new key();
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
        list.findKey(k);
    }
}