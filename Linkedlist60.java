import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist60 {

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

    public Node cloneList() {

        if (head == null) {
            return null;
        }

        Node newHead = new Node(head.data);

        Node oldTemp = head.next;
        Node newTemp = newHead;

        while (oldTemp != null) {
            newTemp.next = new Node(oldTemp.data);

            newTemp = newTemp.next;
            oldTemp = oldTemp.next;
        }

        return newHead;
    }

    public void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Linkedlist60 list = new Linkedlist60();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }

        Node clonedList = list.cloneList();

        System.out.println("Original Linked List:");
        list.display(list.head);

        System.out.println("Cloned Linked List:");
        list.display(clonedList);

        sc.close();
    }
}   