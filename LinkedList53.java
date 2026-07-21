import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist53 {

    public Node removeKth(Node head, int k) {

        if (head == null || k <= 0) {
            return head;
        }

        if (k == 1) {
            return null;
        }

        Node curr = head;
        Node prev = null;
        int count = 1;

        while (curr != null) {

            if (count % k == 0) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
            count++;
        }

        return head;
    }

    public void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Empty Linked List");
            return;
        }

        System.out.println("Enter node values:");

        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        System.out.println("Enter k value:");
        int k = sc.nextInt();

        Linkedlist53 obj = new Linkedlist53();

        System.out.println("Original Linked List:");
        obj.display(head);

        head = obj.removeKth(head, k);

        System.out.println("After removing every kth node:");
        obj.display(head);

        sc.close();
    }
}