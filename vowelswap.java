import java.util.*;
public class vowelswap {
    public static boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
         return ch == 'a' || ch == 'e' || ch == 'i'
              || ch == 'o' || ch == 'u';
    }
    public static String reversevowel(String s){
        char[]arr=s.toCharArray();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right && !isvowel(arr[left])){
                left++;
            }
            while(left<right && !isvowel(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String vow=reversevowel(str);
        System.out.println(vow);
    }
}
