import java.util.*;

public class SearchSorted2DArray {
    public static void main(String[] args) {
        // square matrix
        int[][] matrix = takeInput();
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == num) {
                System.out.println(i + " , " + j);
                return;
            } else if (matrix[i][j] > num)
                j--;
            else
                i++;
        }

        System.out.println("Not found");

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
