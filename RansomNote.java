import java.util.Scanner;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            char ch = ransomNote.charAt(i);

            if (count[ch - 'a'] == 0) {
                return false;
            }

            count[ch - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.next();

        System.out.print("Enter magazine: ");
        String magazine = sc.next();

        boolean result = canConstruct(ransomNote, magazine);

        System.out.println(result);

        sc.close();
    }
}