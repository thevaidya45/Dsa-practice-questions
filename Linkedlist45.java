import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist45 {

    Node head;

    public void insertBeg(int data) {

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
    public int countKey(int key) {

        int count = 0;

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                count++;
            }

            temp = temp.next;
        }

        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Linkedlist45 list = new Linkedlist45();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter values:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            list.insertBeg(value);
        }


        System.out.println("Linked List:");
        list.display();


        System.out.print("Enter key to count: ");
        int key = sc.nextInt();


        int result = list.countKey(key);

        System.out.println("Occurrences of " + key + ": " + result);


        sc.close();
    }
}