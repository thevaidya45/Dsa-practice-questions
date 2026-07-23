import java.util.HashSet;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist58 {

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void removeDuplicate() {

        if (head == null) {
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        Node current = head;
        Node previous = null;

        while (current != null) {

            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }

            current = current.next;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Linkedlist58 list = new Linkedlist58();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        list.removeDuplicate();

        System.out.println("Linked List after removing duplicates:");
        list.display();

        sc.close();
    }
}