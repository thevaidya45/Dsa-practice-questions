import java.util.HashSet;
import java.util.Scanner;

public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter jewels: ");
        String jewels = sc.next();

        System.out.print("Enter stones: ");
        String stones = sc.next();

        System.out.println(numJewelsInStones(jewels, stones));

        sc.close();
    }
}