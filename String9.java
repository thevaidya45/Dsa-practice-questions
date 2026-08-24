import java.util.Scanner;

public class String9 {

    public static String sortSentence(String s) {

        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {

            int pos = word.charAt(word.length() - 1) - '0';

            String actualWord = word.substring(0, word.length() - 1);

            result[pos - 1] = actualWord;
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < result.length; i++) {

            answer.append(result[i]);

            if (i < result.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = sc.nextLine();

        String result = sortSentence(s);

        System.out.println("Sorted sentence: " + result);

        sc.close();
    }
}