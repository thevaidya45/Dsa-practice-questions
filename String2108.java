import java.util.Scanner;

public class String2108 {

    public static String firstPalindrome(String[] words) {

        for (String word : words) {

            int left = 0;
            int right = word.length() - 1;

            boolean palindrome = true;

            while (left < right) {

                if (word.charAt(left) != word.charAt(right)) {
                    palindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (palindrome) {
                return word;
            }
        }

        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        String[] words = new String[n];

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        String result = firstPalindrome(words);

        System.out.println("First palindrome: " + result);

        sc.close();
    }
}