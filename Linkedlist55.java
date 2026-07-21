import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Linkedlist55 {

    public Node insert(Node head, int data) {

        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public void update(Node head, int index, int value) {

        Node temp = head;
        int count = 0;

        while (temp != null) {

            if (count == index) {
                temp.data = value;
                return;
            }

            temp = temp.next;
            count++;
        }

        System.out.println("Index out of range");
    }

    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Linkedlist55 obj = new Linkedlist55();

        Node head = null;

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {
            head = obj.insert(head, sc.nextInt());
        }

        System.out.println("Original Doubly Linked List:");
        obj.display(head);

        System.out.println("Enter index to update:");
        int index = sc.nextInt();

        System.out.println("Enter new value:");
        int value = sc.nextInt();

        obj.update(head, index, value);

        System.out.println("Updated Doubly Linked List:");
        obj.display(head);

        sc.close();
    }
}