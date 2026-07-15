import java.util.*;
public class anagramcheck {
    public static boolean anagram(String s1, String s2){
        s1.toLowerCase();
        s2.toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        int freq[]=new int[26];
        for(char ch: s1.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:s2.toCharArray()){
            freq[ch-'a']--;
        }
        for(int count : freq){
            if(count !=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(anagram(s1, s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not");
        }

    }
}
