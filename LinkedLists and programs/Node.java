public class Node{
    class createNode{
   private int data;
    private createNode next;

    public createNode(int data){this.data=data;}

    public int getData(){return data;}
    public void setData(int data){this.data=data;}
    public createNode getNext(){return next;}
    public void setNext(createNode next){this.next=next;}
    }
public static void main(String[] args){
    Node outer = new Node();
    createNode ten=outer.new createNode(10);
    createNode twenty=outer.new createNode(20);
    createNode thirty=outer.new createNode(30);
    createNode forty=outer.new createNode(40);
    createNode fifty=outer.new createNode(50);

    createNode head=ten;
    ten.setNext(twenty);
    twenty.setNext(thirty);
    thirty.setNext(forty);
    forty.setNext(fifty);
    fifty.setNext(null);
    printLL(head);
}
public static void printLL(createNode head){
    createNode curr=head;
    while(curr.next!=null){
        System.out.print(curr.getData()+" ");
        curr=curr.getNext();
    }
}
}

