import java.util.*;
public class string10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println("Not palindrome");
                break;
            }
        }
        System.out.println("Palindrome");
    }
}
