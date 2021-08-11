import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPaths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> result = getStairPaths(n);
        System.out.println(result);

    }

    public static ArrayList<String> getStairPaths(int n) {
        ArrayList<String> result = new ArrayList<String>();
        getStairPathsHelper(n, "", result);
        return result;
    }

    private static void getStairPathsHelper(int n, String resSoFar, ArrayList<String> result) {
        if (n == 0) {
            result.add(resSoFar);
            return;
        } else if (n < 0)
            return;
        else {
            getStairPathsHelper(n - 1, resSoFar + 1, result);
            getStairPathsHelper(n - 2, resSoFar + 2, result);
            getStairPathsHelper(n - 3, resSoFar + 3, result);
        }

    }
}
