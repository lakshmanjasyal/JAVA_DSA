import java.util.Scanner;

public class CircularLinkedList {
    private Node head, tail;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node curr = head;
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(head)");
    }

    // Method to add a node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head; // Point to itself, circular
        } else {
            newNode.next = head;
            tail.next = newNode; // Last node points to the new node
            head = newNode; // Update head to the new node
        }
    }

    // Method to add a node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head; // Point to itself, circular
        } else {
            tail.next = newNode; // Previous last node points to the new node
            tail = newNode; // Update tail to the new node
            tail.next = head; // New last node points to head
        }
    }

    // Method to delete the first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            tail.next = head.next; // Last node points to the second node
            head = head.next; // Update head to the second node
        }
    }

    // Method to delete the last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head == tail) { // Only one node
            head = tail = null;
        } else {
            Node curr = head;
            while (curr.next != tail) { // Traverse to the second last node
                curr = curr.next;
            }
            curr.next = head; // Second last node points to head
            tail = curr; // Update tail to second last node
        }
    }

    // Method to concatenate strings of elements in the list
    public String concatenate() {
        StringBuilder sb = new StringBuilder();
        if (head == null) {
            return sb.toString(); // Empty string if list is empty
        }
        Node curr = head;
        do {
            sb.append(curr.data).append(" "); // Append data with a space
            curr = curr.next;
        } while (curr != head);
        return sb.toString().trim(); // Return concatenated string
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCircular Linked List Menu:");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Delete First");
            System.out.println("4. Delete Last");
            System.out.println("5. Display");
            System.out.println("6. Concatenate");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to add at the beginning: ");
                    int valueToAddFirst = sc.nextInt();
                    list.addFirst(valueToAddFirst);
                    break;
                case 2:
                    System.out.print("Enter the value to add at the end: ");
                    int valueToAddLast = sc.nextInt();
                    list.addLast(valueToAddLast);
                    break;
                case 3:
                    list.deleteFirst();
                    break;
                case 4:
                    list.deleteLast();
                    break;
                case 5:
                    list.display();
                    break;
                case 6:
                    System.out.println("Concatenated string: " + list.concatenate());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
