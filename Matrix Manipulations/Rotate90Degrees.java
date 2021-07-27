import java.util.*;

public class Rotate90Degrees {
    public static void main(String[] args) {
        int[][] matrix = takeInput();

        // Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse rows
        for (int i = 0; i < matrix.length; i++) {
            int li = 0;
            int ri = matrix[i].length - 1;
            while (li <= ri) {
                int temp = matrix[i][li];
                matrix[i][li] = matrix[i][ri];
                matrix[i][ri] = temp;
                li++;
                ri--;
            }
        }

        printMatrix(matrix, matrix.length, matrix[0].length);

    }

    private static int[][] takeInput() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] mat, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
