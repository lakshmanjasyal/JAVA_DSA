import java.util.*;
class searchElement{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
// // addElement
//     public void addFirst(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     } 
// // printElement
//     public void printList(){
//         Node currNode=head;
//         while(currNode!=null){
//             System.out.println(currNode+" -> ");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // searchElement list=new searchElement();
        LinkedList<Integer> list=new LinkedList<Integer>();
// takeinput
        System.out.print("Enter the elements of Linkedlist:");
        for(int i=0;i<7;i++){
            int element=sc.nextInt();
            list.addLast(element);
        }
// printList
        System.out.println(list);
// enterKey
        System.out.print("Enter the element you want to find:");
        int key=sc.nextInt();
// searchElement
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                System.out.println(key+" is found at index "+ i);
                return;
            }
            
        }
        System.out.println(key+" is not found!");
}}
