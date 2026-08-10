import java.util.*;

class array42 {

    public static void leftRotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];
        int j = 0;

        for (int i = k; i < n; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int k = 2;

        leftRotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}