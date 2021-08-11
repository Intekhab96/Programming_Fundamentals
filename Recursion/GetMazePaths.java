import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePaths {
    private static int n, m;

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        m = scn.nextInt();
        ArrayList<String> result = getMazePaths(1, 1, n, m);
        System.out.println(result);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> result = new ArrayList<>();
        getMazePathsHelper(sr, sc, dr, dc, "", result);
        return result;
    }

    private static void getMazePathsHelper(int sr, int sc, int dr, int dc, String pathSoFar, ArrayList<String> result) {

        if (sr > n || sc > m)
            return;
        else if (sr == dr && sc == dc) {
            result.add(pathSoFar);
        } else {
            getMazePathsHelper(sr, sc + 1, dr, dc, pathSoFar + "h", result);
            getMazePathsHelper(sr + 1, sc, dr, dc, pathSoFar + "v", result);
        }

    }
}
