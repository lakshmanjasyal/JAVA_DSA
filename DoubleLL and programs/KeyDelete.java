import java.util.*;
public class KeyDelete {
    private Node head,tail;
    private class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
// display
public void display(){
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" <-> ");
        curr=curr.next;
    }
    System.out.println("null");
}
// addLast
 public void addLast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.prev=tail;
    tail.next=newNode;
    tail=newNode;
}

// // delete key
// public void deleteKey(int key){
//     Node curr=head;
//     if(head.data==key){
//         head.next.prev=null;
//         head=head.next;
//        return;
//     }
//     if(tail.data==key){
//         tail.prev.next=null;
//         tail=tail.prev;
//         return;
//     }
//     while(curr!=null){
//         if(curr.data==key){
//             System.out.println("Key is found.");
//             curr.prev.next=curr.next;
//             curr.next.prev=curr.prev;
//             return;
//         }
//         curr=curr.next;
//     }
//     if(curr==null){
//         System.out.println("Key is not in the list.");
//     }
// }
// chatgpt
public void deleteKey(int key) {
    if (head == null) {
        System.out.println("List is empty.");
        return;
    }
    
    Node curr = head;
    while (curr != null) {
        if (curr.data == key) {
            System.out.println("Key is found.");
            if (curr == head) {
                head = head.next;
                if (head != null) head.prev = null;
                else tail = null; // Handle single-node case
            } else if (curr == tail) {
                tail = tail.prev;
                if (tail != null) tail.next = null;
                else head = null; // Handle single-node case
            } else {
                curr.prev.next = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
            }
            return;
        }
        curr = curr.next;
    }
    System.out.println("Key is not in the list.");
}


public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
        KeyDelete list=new KeyDelete();
            System.out.print("Enter the number of values:");
            int k=sc.nextInt();
            System.out.print("Enter the values:");
            for(int i=0;i<k;i++){
                list.addLast(sc.nextInt());
            }
            System.out.print("Enter the key to delete:");
            int key=sc.nextInt();
            list.deleteKey(key);
            list.display();
}
}
}
