import java.util.*;

public class string11 {

    public static boolean palindrome(String s) {

        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        int odd = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                odd++;
            }
        }

        return odd <= 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (palindrome(s)) {
            System.out.println("Palindrome can be formed");
        } else {
            System.out.println("Palindrome cannot be formed");
        }

        sc.close();
    }
}