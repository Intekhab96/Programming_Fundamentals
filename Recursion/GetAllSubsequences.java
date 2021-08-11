import java.util.ArrayList;
import java.util.Scanner;

public class GetAllSubsequences {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        ArrayList<String> result = gss(input);
        System.out.println(result);
    }

    public static ArrayList<String> gss(String str) {
        ArrayList<String> result = new ArrayList<>();
        gssHelper(str, "", 0, result);
        return result;
    }

    private static void gssHelper(String str, String strSoFar, int idx, ArrayList<String> result) {

        if (idx == str.length()) {
            result.add(strSoFar);
            return;
        }
        gssHelper(str, strSoFar, idx + 1, result);
        gssHelper(str, strSoFar + str.charAt(idx), idx + 1, result);
    }
}
