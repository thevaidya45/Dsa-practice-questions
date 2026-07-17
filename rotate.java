import java.util.Scanner;

public class rotate {

    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String s = sc.nextLine();
        String goal = sc.nextLine();

        // Output
        System.out.println(rotateString(s, goal));

        sc.close();
    }
}