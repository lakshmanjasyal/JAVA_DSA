
class LL {
    Node head;
    private int Size;
    LL(){
        this.Size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            Size++;
        }
    }

    // addFirst
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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


    // deleteFirst
    public void deleteFirst(){
        if(head==null){System.out.println("List is empty");
    return;
}
        Size--;
        head=head.next;
    }


    //deleteLast
    public void deleteLast(){
        if(head==null){
        System.out.println("List is empty");
        return;
    }
    Size--;
    if(head.next==null){
        head=null;
        return;
    }
    Node secondLast=head;
    Node lastNode=head.next;
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondLast=secondLast.next;

    }
    secondLast.next=null;

    }

    //Size
    public int getSize(){
        return Size;
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
        LL list=new LL();

        list.printList();

        list.addFirst("a");
        list.printList();

        list.addFirst("is");
        list.printList();

        list.addLast("List");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("This");
        System.out.println(list.getSize());


    }
}
