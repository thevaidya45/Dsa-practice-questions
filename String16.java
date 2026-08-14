import java.util.Scanner;

public class String16 {

    public static char findTheDifference(String s, String t) {

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            count[ch - 'a']--;
            if (count[ch - 'a'] < 0) {
                return ch;
            }
        }

        return ' ';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.next();

        System.out.print("Enter string t: ");
        String t = sc.next();

        char result = findTheDifference(s, t);

        System.out.println("Extra character: " + result);

        sc.close();
    }
}