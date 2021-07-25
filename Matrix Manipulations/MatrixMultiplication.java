import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = takeInput();
        int[][] matrix2 = takeInput();
        if (matrix1[0].length != matrix2.length)
            System.out.println("Invalid input");
        else {
            int[][] matrix3 = matrixMul(matrix1, matrix2);
            System.out.println("\n");

            printMatrix(matrix3, matrix3.length, matrix3[0].length);
        }
    }

    private static int[][] matrixMul(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] takeInput() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
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
