import java.util.*;

public class array44 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int maxs = Integer.MIN_VALUE;
        int sum = 0;

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxs) {
                maxs = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Max sum is: " + maxs);
    }
}