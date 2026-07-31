import java.util.Scanner;

public class ReverseString {

    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        reverseString(arr);

        System.out.print("Reversed String: ");

        for (char c : arr) {
            System.out.print(c);
        }

        sc.close();
    }
}