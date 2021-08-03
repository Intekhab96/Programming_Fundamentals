import java.util.*;

public class SaddlePoint {
    public static void main(String[] args) {
        // Square matrix.
        // Saddle point : min in row, max in col.
        // there cant be more than one saddle point
        int[][] matrix = takeInput();
        for (int i = 0; i < matrix.length; i++) {
            int minRowElementIndex = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < matrix[i][minRowElementIndex]) {
                    minRowElementIndex = j;
                }
            }
            boolean flag = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minRowElementIndex] > matrix[i][minRowElementIndex]) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(matrix[i][minRowElementIndex]);
                return;
            }
        }
        System.out.println("NO Saddle point found.");
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
