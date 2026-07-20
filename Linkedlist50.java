import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist50 {

    public static Node middleNode(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;         
            fast = fast.next.next;     
        }

        return slow;
    }
    public static Node insert(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();


        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            head = insert(head, value);
        }


        System.out.println("Linked List:");
        display(head);


        Node middle = middleNode(head);

        System.out.println("Middle node: " + middle.data);


        sc.close();
    }
}