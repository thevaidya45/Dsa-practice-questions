import java.util.Scanner;

public class ReverseStringII {

    public static String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i += 2 * k) {

            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.next();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println(reverseStr(s, k));

        sc.close();
    }
}