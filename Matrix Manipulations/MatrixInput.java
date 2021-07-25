import java.util.* ;
class MatrixInput {
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] matrix = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println();
        printMatrix(matrix,n,m);

    }


    public static void printMatrix(int [][] mat, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}