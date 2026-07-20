
import java.util.*;
class Node{
   int data;
   Node next;
Node (int data){
    this.data=data;
    this.next=null;
}
}
public class Linkedlist49 {
    public static Node mergertwo(Node l1 ,Node l2){
        Node dummy =new Node(-1);
        Node temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.data <= l2.data){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;

            }
            temp=temp.next;
        }
        if(l1!=null){
            temp.next=l1;
        }
        if(l2!=null){
            temp.next=l2;
        }
        return dummy.next;

    }
     public static Node insert(Node head, int val) {

        Node newNode = new Node(val);

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

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }
}
