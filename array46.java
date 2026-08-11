import java.util.*;

public class array46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] count = new int[n + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {

            if (count[i] > 1) {
                System.out.println("Repeating number is: " + i);
            }

            if (count[i] == 0) {
                System.out.println("Missing number is: " + i);
            }
        }

        sc.close();
    }
}