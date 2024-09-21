import java.util.Scanner;

class swapAlternativeNode{
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
            System.out.print(currNode.data+" --> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void swap(){
        if(head==null||head.next==null){
            System.out.println("No element or only one element exists");
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        
        head=currNode;
        while(currNode!=null){
            prevNode.next=currNode.next;
            currNode.next=prevNode;
            if(prevNode.next!=null && prevNode.next.next!=null){
                Node temp=prevNode.next;
                prevNode.next=prevNode.next.next;
                prevNode=temp;
                currNode=prevNode.next;
            }else{
                break;
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        swapAlternativeNode list=new swapAlternativeNode();
        System.out.print("Enter the number of elements of Linked Lists:");
        int n=sc.nextInt();
        System.out.print("Enter the elements of Linked Lists:");
        for(int i=0;i<n;i++){
            int element=sc.nextInt();
            list.addLast(element);
        }  
        System.out.print("Before Swapping:");
        list.print(); 
        list.swap();
        System.out.print("After Swapping:");
        list.print();
    }
}


// public void swap(){
//     if(head==null){
//         System.out.println("No element to swap");
//         return;
//     }
//     if(head.next==null){
//         System.out.println("Only one element exists");
//         return;
//     }

//     Node prevNode=head;
//     Node currNode=head.next;
//     while(currNode!=null && currNode.next!=null){
//         prevNode.next=currNode.next;
//         currNode.next=prevNode;

//         //updation
//         prevNode=prevNode.next.next;
//         currNode=currNode.next.next;
//     }
// }
