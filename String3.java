import java.util.*;
public class String3 {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      boolean [] seen=new boolean[256];
      StringBuilder br=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(!seen[ch]){
            br.append(ch);
            seen[ch]=true;

        }
      }
      System.out.println(br);
    }
}
