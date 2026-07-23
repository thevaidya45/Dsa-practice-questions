import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist57 {

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

    public void oddEven() {
        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;

        Node temp = head;

        while (temp != null) {
            if (temp.data % 2 != 0) {
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            } else {
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            }
            temp = temp.next;
        }

        if (oddHead == null) {
            head = evenHead;
            if (evenTail != null)
                evenTail.next = null;
            return;
        }

        oddTail.next = evenHead;

        if (evenTail != null)
            evenTail.next = null;

        head = oddHead;
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

        Linkedlist57 list = new Linkedlist57();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        list.oddEven();

        System.out.println("Linked List after segregation:");
        list.display();

        sc.close();
    }
}