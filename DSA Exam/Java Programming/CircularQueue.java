import java.util.*;

class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize the queue with a given capacity
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = -1; // Empty queue
        size = 0;
    }

    // Enqueue (add element to the rear)
    public void Enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full");
            return;
        }

        // If queue is empty, initialize front and rear
        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity; // Circular increment
        }

        queue[rear] = data;
        size++;
        System.out.println("Enqueued element: " + data);
    }

    // Dequeue (remove element from the front)
    public void Dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        int dequeuedElement = queue[front];
        System.out.println("Dequeued element: " + dequeuedElement);

        // If there is only one element, reset front and rear
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity; // Circular increment
        }

        size--;
    }

    // Display the queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.print(queue[i] + "|");
            i = (i + 1) % capacity; // Circular increment
        }
        System.out.println();
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int capacity = sc.nextInt();

        CircularQueue queue = new CircularQueue(capacity);

        while (true) {
            System.out.println("\nEnter the operation:\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = sc.nextInt();
                    queue.Enqueue(element);
                    queue.display();
                    break;
                case 2:
                    queue.Dequeue();
                    queue.display();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}

