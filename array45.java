import java.util.*;

public class array45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] positive = new int[n];
        int[] negative = new int[n];

        int pos = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {

            if (arr[i] >= 0) {
                positive[pos] = arr[i];
                pos++;
            } else {
                negative[neg] = arr[i];
                neg++;
            }
        }
        int[] result = new int[n];

        int p = 0;
        int ne = 0;
        int index = 0;
        while (p < pos && ne < neg) {

            result[index] = positive[p];
            p++;
            index++;

            result[index] = negative[ne];
            ne++;
            index++;
        }
        while (p < pos) {
            result[index] = positive[p];
            p++;
            index++;
        }
        while (ne < neg) {
            result[index] = negative[ne];
            ne++;
            index++;
        }

        System.out.println(Arrays.toString(result));
    }
}