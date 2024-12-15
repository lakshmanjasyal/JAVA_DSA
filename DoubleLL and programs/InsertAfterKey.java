import java.util.*;
public class InsertAfterKey {
    private Node head,tail;
    private class Node{
        char data;
        Node next;
        Node prev;
        Node(char data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
// display forward
public void forwardTraversal(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" <-> ");
        curr=curr.next;
    }
    System.out.println("null");
}
// addLast
public void addLast(char data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    newNode.prev=tail;
    tail=newNode;
}
// finding key
public void findKey(char key){
    Node curr=head;
    while(curr!=null){
        if(curr.data==key){
            System.out.println("Key is found.");
            return;
        }
        curr=curr.next;
    }
    if(curr==null){
        System.out.println("Key is not found.");
    }
}
// insert After Key
public void insertAfterKey(char key,char afterKey){
    Node newNode=new Node(afterKey);
    Node curr=head;
    while(curr!=null){
        if(curr.data==key){
            newNode.next=curr.next;
            curr.next.prev=newNode;
            curr.next=newNode;
            newNode.prev=curr;
            return;
        }
        curr=curr.next;
    }
    if(curr==null){
        System.out.println("Key is not found.");
        return;
    }
}
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            InsertAfterKey list=new InsertAfterKey();
            System.out.print("Enter the number of characters:");
            int k=sc.nextInt();
            System.out.print("Enter the characters:");
            for(int i=0;i<k;i++){
                list.addLast(sc.next().charAt(0));
            }
            System.out.print("Enter the character to search:");
            char ch1=sc.next().charAt(0);
            list.findKey(ch1);
            System.out.print("Enter the character to enter:");
            char ch2=sc.next().charAt(0);
            System.out.print("After inserting after key:");
            list.insertAfterKey(ch1, ch2);
            list.forwardTraversal();




        }
    }
}
