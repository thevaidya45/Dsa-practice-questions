import java.util.*;

public class NegativeEvenRowsSwap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Process
        for (int i = 0; i < rows; i += 2) {

            // Make even row negative
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = -matrix[i][j];
            }

            // Swap with next row if it exists
            if (i + 1 < rows) {
                int[] temp = matrix[i];
                matrix[i] = matrix[i + 1];
                matrix[i + 1] = temp;
            }
        }

        // Print matrix
        System.out.println("Modified Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}