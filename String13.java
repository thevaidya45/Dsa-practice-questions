import java.util.*;

public class String13 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int count[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}