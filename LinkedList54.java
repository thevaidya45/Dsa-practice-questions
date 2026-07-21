import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList54 {
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void  display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("ENter node ");
        Node head=new Node(sc.nextInt());
        Node temp=head;
        for(int i=1;i<n;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        LinkedList54 obj =new LinkedList54();
        obj.display(head);
        head=obj.reverse(head);
        obj.display(head);
    }
}

