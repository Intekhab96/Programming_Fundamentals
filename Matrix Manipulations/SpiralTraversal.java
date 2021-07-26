import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] matrix = takeInput();
        int minR = 0;
        int minC = 0;
        int maxR = matrix.length - 1;
        int maxC = matrix[0].length - 1;

        int count = 0;
        int tCount = matrix.length * matrix[0].length;
        while (count < tCount) {
            // left
            for (int i = minR, j = minC; i <= maxR && count < tCount; i++) {
                System.out.print(matrix[i][j] + " ");
                count++;
            }
            minC++;
            // bottom
            for (int i = maxR, j = minC; j <= maxC && count < tCount; j++) {
                System.out.print(matrix[i][j] + " ");
                count++;
            }
            maxR--;
            // right
            for (int i = maxR, j = maxC; i >= minR && count < tCount; i--) {
                System.out.print(matrix[i][j] + " ");
                count++;
            }
            maxC--;
            // top
            for (int i = minR, j = maxC; j >= minC && count < tCount; j--) {
                System.out.print(matrix[i][j] + " ");
                count++;
            }
            minR++;
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
