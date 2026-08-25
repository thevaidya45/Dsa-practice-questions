import java.util.Scanner;

public class String1967 {

    public static int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String pattern : patterns) {

            if (word.contains(pattern)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patterns: ");
        int n = sc.nextInt();

        String[] patterns = new String[n];

        System.out.println("Enter patterns:");

        for (int i = 0; i < n; i++) {
            patterns[i] = sc.next();
        }

        System.out.print("Enter word: ");
        String word = sc.next();

        int result = numOfStrings(patterns, word);

        System.out.println("Number of substrings: " + result);

        sc.close();
    }
}