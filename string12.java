import java.util.*;

public class string12 {

    public static void countCharacters(String s) {

        int vowels = 0;
        int consonants = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }

            } else if (!Character.isDigit(ch)) {
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
        System.out.println("Special Characters = " + special);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        countCharacters(s);

        sc.close();
    }
}