import java.util.*;

public class WaveTraversal {
    public static void main(String[] args) {
        int[][] matrix = takeInput();
        int col = 0;
        while (col < matrix[0].length) {
            if (col % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(matrix[i][col] + " ");
                }

            } else {
                for (int i = matrix.length - 1; i >= 0; i--) {
                    System.out.println(matrix[i][col] + " ");
                }
            }
            col++;
        }
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
}
