import java.util.*;

public class String5 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] words = s.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}