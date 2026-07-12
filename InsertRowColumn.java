import java.util.*;

public class InsertRowColumn {

    public static void main(String[] args) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter row position to insert (0 to " + rows + "): ");
        int rowPos = sc.nextInt();

        int[] newRow = new int[cols];

        System.out.println("Enter elements of new row:");

        for (int i = 0; i < cols; i++) {
            newRow[i] = sc.nextInt();
        }

        int[][] rowMatrix = new int[rows + 1][cols];

        int oldRow = 0;

        for (int i = 0; i < rows + 1; i++) {

            if (i == rowPos) {

                for (int j = 0; j < cols; j++) {
                    rowMatrix[i][j] = newRow[j];
                }

            } else {

                for (int j = 0; j < cols; j++) {
                    rowMatrix[i][j] = matrix[oldRow][j];
                }

                oldRow++;
            }
        }
        System.out.print("Enter column position to insert (0 to " + cols + "): ");
        int colPos = sc.nextInt();

        int[] newCol = new int[rows + 1];

        System.out.println("Enter elements of new column:");

        for (int i = 0; i < rows + 1; i++) {
            newCol[i] = sc.nextInt();
        }

        int[][] finalMatrix = new int[rows + 1][cols + 1];

        for (int i = 0; i < rows + 1; i++) {

            int oldCol = 0;

            for (int j = 0; j < cols + 1; j++) {

                if (j == colPos) {
                    finalMatrix[i][j] = newCol[i];
                } else {
                    finalMatrix[i][j] = rowMatrix[i][oldCol];
                    oldCol++;
                }
            }
        }
        System.out.println("\nMatrix after inserting row and column:");

        for (int i = 0; i < rows + 1; i++) {
            for (int j = 0; j < cols + 1; j++) {
                System.out.print(finalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}