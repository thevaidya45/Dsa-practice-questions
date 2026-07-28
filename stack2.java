import java.util.*;
class stack2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
          
        int remove=s.pop();
        System.out.println("Removed item "+remove);
        System.out.println(s);
    }
}