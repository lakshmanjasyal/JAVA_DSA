import java.util.Scanner;

class deleteKey2chatgpt {
    Node head;

    // Inner class representing a node in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Method to print the linked list
    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Method to delete the node after the key node
    public void deleteAfterKey(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        // Traverse the list to find the node with the given key
        while (currNode != null && currNode.data != key) {
            currNode = currNode.next;
        }

        // If key is found and there is a node after the key, delete it
        if (currNode != null && currNode.next != null) {
            System.out.println("Element is found. Deleting node after key.");
            currNode.next = currNode.next.next;
        } else if (currNode != null && currNode.next == null) {
            // If key is the last node, nothing to delete
            System.out.println("Element is found, but no node exists after key to delete.");
        } else {
            // If key is not found in the list
            System.out.println("Element not found.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        deleteKey2chatgpt list = new deleteKey2chatgpt();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            list.addLast(element);
        }

        // Print the initial linked list
        list.print();

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        // Delete the node after the specified key
        list.deleteAfterKey(key);

        // Print the linked list after deletion
        list.print();
    }
}
