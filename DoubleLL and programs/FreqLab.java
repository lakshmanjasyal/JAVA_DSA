import java.util.*;

public class FreqLab {
    private Node head, tail;

    private class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to display the list
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Method to add a new node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    // // Method to calculate and print frequency of each unique element
    // public void frequencyOfEachElement() {
    //     Node outer = head;

    //     while (outer != null) {
    //         // Count occurrences of the current element
    //         int count = 0;
    //         Node inner = outer;

    //         // Count occurrences of outer's data in the entire list
    //         while (inner != null) {
    //             if (inner.data == outer.data) {
    //                 count++;
    //             }
    //             inner = inner.next;
    //         }

    //         // Print the frequency of the current element only if count > 0
    //         if (count > 0) {
    //             System.out.println("Element " + outer.data + " occurs " + count + " times.");
    //         }

    //         // Move to the next element
    //         Node temp = outer.next;

    //         // Skip over all nodes with the same data as the current outer
    //         while (temp != null && temp.data == outer.data) {
    //             temp = temp.next;
    //         }

    //         outer = temp; // Update outer to the next unique element
    //     }
    // }    NOT DESIRED OUTPUT 
 public void frequency(int element) {
        Node curr = head;
        int count = 0;
        
        while (curr != null) {
            if (curr.data == element) {
                count++;
            }
            curr = curr.next;
        }
        
        System.out.println("Frequency of " + element + " is: " + count);
    }
    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            FreqLab list = new FreqLab();    
            System.out.print("Enter the number of values: ");
            int k = sc.nextInt();
            System.out.print("Enter the values: ");
            for (int i = 0; i < k; i++) {
                list.addLast(sc.nextInt());
            }
            list.display();
            // // Call the frequency calculation method
            // list.frequencyOfEachElement();
            System.out.print("Enter the element you want to calculate frequency:");
            int l=sc.nextInt();
            list.frequency(l);
        }
    }
}
