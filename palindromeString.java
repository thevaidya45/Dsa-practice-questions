import java.util.*;
public class palindromeString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        int flag=0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                flag=1;
                break;
            }
            left++;
            right--;
        }
        if(flag==0){
           System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
