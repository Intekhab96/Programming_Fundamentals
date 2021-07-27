import java.util.*;

public class ShellRotate {
    public static void main(String[] args) {
        int[][] matrix = takeInput();
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int r = scn.nextInt();
        rotateShell(matrix, s, r);
        printMatrix(matrix);
    }

    private static void rotateShell(int[][] matrix, int shell, int rotateBy) {
        int[] oneD = fillOneDFromShell(matrix, shell);
        rotate(oneD, rotateBy);
        fillBackShellFromOneD(matrix, oneD, shell);
    }

    private static int[] fillOneDFromShell(int[][] matrix, int shell) {
        int minR = shell - 1;
        int minC = shell - 1;
        int maxR = matrix.length - shell;
        int maxC = matrix[0].length - shell;
        // simplify below equation
        int elementCountInShell = 2 * (maxR - minR + 1) + 2 * (maxC - minC + 1) - 4;
        int[] oneD = new int[elementCountInShell];
        // traverse shell
        int index = 0;
        // Left wall
        for (int i = minR, j = minC; i <= maxR; i++) {
            oneD[index++] = matrix[i][j];
        }
        minC++;
        // Bottom wall
        for (int i = maxR, j = minC; j <= maxC; j++) {
            oneD[index++] = matrix[i][j];
        }
        maxR--;
        // right wall
        for (int i = maxR, j = maxC; i >= minR; i--) {
            oneD[index++] = matrix[i][j];
        }
        maxC--;
        // top wall
        for (int i = minR, j = maxC; j >= minC; j--) {
            oneD[index++] = matrix[i][j];
        }
        minR++;

        return oneD;
    }

    private static void fillBackShellFromOneD(int[][] matrix, int[] oneD, int shell) {
        int minR = shell - 1;
        int minC = shell - 1;
        int maxR = matrix.length - shell;
        int maxC = matrix[0].length - shell;
        // traverse shell
        int index = 0;
        // Left wall
        for (int i = minR, j = minC; i <= maxR; i++) {
            matrix[i][j] = oneD[index++];
        }
        minC++;
        // Bottom wall
        for (int i = maxR, j = minC; j <= maxC; j++) {
            matrix[i][j] = oneD[index++];
        }
        maxR--;
        // right wall
        for (int i = maxR, j = maxC; i >= minR; i--) {
            matrix[i][j] = oneD[index++];
        }
        maxC--;
        // top wall
        for (int i = minR, j = maxC; j >= minC; j--) {
            matrix[i][j] = oneD[index++];
        }
        minR++;
    }

    private static void rotate(int[] arr, int rotateBy) {
        rotateBy = rotateBy % arr.length;
        if (rotateBy < 0) {
            rotateBy += arr.length;
        }
        reverse(arr, 0, arr.length - rotateBy - 1);
        reverse(arr, arr.length - rotateBy, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int li, int ri) {
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
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

    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
