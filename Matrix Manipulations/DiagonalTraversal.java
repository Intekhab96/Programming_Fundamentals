import java.util.*;

public class DiagonalTraversal {
    public static void main(String[] args) {
        // should be square matrix
        int[][] matrix = takeInput();
        for (int gap = 0; gap < matrix.length; gap++) {
            for (int row = 0, col = gap; col < matrix.length; row++, col++) {
                System.out.println(matrix[row][col]);
            }
        }
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
}
