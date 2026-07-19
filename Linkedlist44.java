import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Linkedlist44 {
      Node head;
    public void insertbeg(int data){
       Node newnode=new Node(data);
       if(head==null){
        head=newnode;
        return ;
       }
       newnode.next=head;
       head=newnode;

    }
    public int counter(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Linkedlist44 list=new Linkedlist44();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            list.insertbeg(value);
        }
        System.out.println("Total = "+list.counter());
    }
}
