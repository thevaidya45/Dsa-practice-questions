import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linkedlist51 {
    public boolean ispalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        Node secondhalf =reverse(slow.next);
        Node firsthalf=head;
        Node temp=secondhalf;
        while(temp!=null){
            if(firsthalf.data != temp.data){
                return false;
            }
            firsthalf=firsthalf.next;
            temp=temp.next;
        }
        return true;
    }
    public Node reverse(Node head){
        Node prev=null;
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of nodes: ");
    int n = sc.nextInt();

    if (n == 0) {
        System.out.println("Palindrome");
        return;
    }

    System.out.println("Enter the node values:");

    Node head = new Node(sc.nextInt());
    Node temp = head;

    for (int i = 1; i < n; i++) {
        temp.next = new Node(sc.nextInt());
        temp = temp.next;
    }

    Linkedlist51 obj = new Linkedlist51();

    if (obj.ispalindrome(head)) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }

    sc.close();
}
}
