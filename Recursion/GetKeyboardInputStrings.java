import java.util.ArrayList;
import java.util.Scanner;

public class GetKeyboardInputStrings {
    private static String[] map = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        ArrayList<String> result = getKPC(input);
        System.out.println(result);
    }

    public static ArrayList<String> getKPC(String str) {
        ArrayList<String> result = new ArrayList<String>();
        getKPCHelper(str, 0, "", result);
        return result;
    }

    private static void getKPCHelper(String input, int idx, String strSoFar, ArrayList<String> result) {
        if (idx == input.length()) {
            result.add(strSoFar);
            return;
        }
        String value = map[input.charAt(idx) - '0'];
        for (int j = 0; j < value.length(); j++) {
            getKPCHelper(input, idx + 1, strSoFar + value.charAt(j), result);
        }
    }
}
