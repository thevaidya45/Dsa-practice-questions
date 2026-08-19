import java.util.Scanner;

public class String7 {

    public static int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {

            char current = chars[read];
            int start = read;

            while (read < chars.length && chars[read] == current) {
                read++;
            }

            int count = read - start;

            chars[write] = current;
            write++;

            if (count > 1) {

                String countString = String.valueOf(count);

                for (int i = 0; i < countString.length(); i++) {
                    chars[write] = countString.charAt(i);
                    write++;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] chars = new char[n];

        System.out.println("Enter characters:");

        for (int i = 0; i < n; i++) {
            chars[i] = sc.next().charAt(0);
        }

        int length = compress(chars);

        System.out.print("Compressed string: ");

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();

        System.out.println("Compressed length: " + length);

        sc.close();
    }
}