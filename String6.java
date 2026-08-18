import java.util.*;

public class String6{

    public static int longestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            int length = right - left + 1;

            if (length > max) {
                max = length;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(longestSubstring(s));

        sc.close();
    }
}