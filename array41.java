import java.util.*;

class array41 {

    public static int[] replace(int[] arr) {
        int maxRight = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {

            int current = arr[i];
            arr[i] = maxRight;
            if (current > maxRight) {
                maxRight = current;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {17, 18, 5, 4, 6, 1};

        int[] result = replace(arr);

        System.out.println(Arrays.toString(result));
    }
}