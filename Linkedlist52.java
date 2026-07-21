import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linkedlist52 {
    public Node removedup(Node head){
        if(head==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
    public void printlist(Node head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Empty");
            return ;
        }
        System.out.println("Enter node elements");
        Node head=new Node(sc.nextInt());
        Node temp=head;
        for(int i=1;i<n;i++){
            temp.next=new Node(sc.nextInt());
            temp=temp.next;
        }
        Linkedlist52 obj=new Linkedlist52();
        obj.printlist(head);
        head=obj.removedup(head);
        obj.printlist(head);
    }

}
