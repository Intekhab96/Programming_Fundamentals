import java.util.*;

public class ExitPoint {
    public static void main(String[] args) {

        int[][] matrix = takeInput();

        /**
         * dir : direction 0: East 1: South 2: West 3: North
         */

        int dir = 0;
        int i = 0, j = 0;

        while (true) {
            dir = (dir + matrix[i][j]) % 4;

            if (dir == 0) {
                j++;
            } else if (dir == 1) {
                i++;
            } else if (dir == 2) {
                j--;
            } else if (dir == 3) {
                i--;
            }

            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == matrix.length) {
                i--;
                break;
            } else if (j == matrix[0].length) {
                j--;
                break;
            }
        }

        System.out.println("\n" + i + "  " + j);

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
