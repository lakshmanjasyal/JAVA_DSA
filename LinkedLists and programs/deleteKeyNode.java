import java.util.Scanner;

class deleteKeyNode{
    Node head;
    class Node{
        int data;
        Node next; 
        Node(int d){
            this.data=d;
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
        Node currNode =head;
        while(currNode!=null){
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void deleteKey(int key){
        if(head.data==key){
            head=head.next;
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null){
            if(currNode.data==key){
                prevNode.next=currNode.next;
                return;
            }
            prevNode=currNode;
            currNode=currNode.next;
        }
        if(currNode==null){
            System.out.println("Not found");}
    }
    // public void deleteKey(int key){
    //     if(head.data==key){
    //      head=head.next;
    //      return;
    //       }
    //       Node curr=head;
    //       Node prev=head;
    //       while((curr.data!=key)&&(curr!=null)){
    //         prev=curr;
    //         curr=curr.next;
    //       }
    //       if(curr==null){
    //         System.out.println("Not found");
    //       }else{
    //         prev.next=curr.next;
    //       }
    // }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         deleteKeyNode list=new deleteKeyNode();
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
        list.deleteKey(k);
        list.print();        

    }
}