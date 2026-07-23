import java.util.*;
class Node{
    String data;
    Node next;
    Node(String data){
       this.data=data;
       this.next=null; 
    }
}
public class Linkedlist56 {
    static Node head;
    public static void Delprefix(String prefix){
        while(head!=null && head.data.startsWith(prefix)){
            head=head.next;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.data.startsWith(prefix)){
                temp.next=temp.next.next;

            }
            else{
                temp=temp.next;
            }
        }
        
    }
    public static void insertdata(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        
    }
    public static void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n=sc.nextInt();
        System.out.println("ENter node elements");
        for(int i=0;i<n;i++){
            String pre=sc.nextLine();
            insertdata(pre);
        }
        System.out.println("Original ");
        display();
        String prefix=sc.nextLine();
        Delprefix(prefix);
        System.out.println("After delete");
        display();
        
    }
}
