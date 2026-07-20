import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist47 {

    public static boolean Cycle(Node head) {

        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
    public static Node createlist(Scanner sc, int n) {

        Node head = null;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

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

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = createlist(sc, n);

        System.out.println("Linked List:");
        display(head);
        if (Cycle(head)) {
            System.out.println("Cycle detected");
        } 
        else {
            System.out.println("No cycle detected");
        }

        sc.close();
    }
}