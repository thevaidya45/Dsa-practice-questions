import java.util.Scanner;

public class String8 {

    public static String truncateSentence(String s, int k) {

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < k; i++) {

            result.append(words[i]);

            if (i < k - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        String result = truncateSentence(s, k);

        System.out.println("Result: " + result);

        sc.close();
    }
}