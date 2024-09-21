public class reverseiteLL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
     // addLast
    public void addLast(String data){
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
public void reverseIterate(){
    if(head == null || head.next==null){
        return;
    }
    Node prevNode=head;
    Node currNode=head.next;
    while(currNode!=null){
        Node nextNode=currNode.next;
        currNode.next=prevNode;
//update
        prevNode=currNode;
        currNode=nextNode;
    }
    head.next=null;
    head=prevNode;
}
public void printList(){
        if(head==null){System.out.print("List is empty");}
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println(" Null");
    }

    public static void main(String args[]){
        reverseiteLL list=new reverseiteLL();
        list.addLast("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("List");
        list.printList();
        list.reverseIterate();
        list.printList();
     } 
}
