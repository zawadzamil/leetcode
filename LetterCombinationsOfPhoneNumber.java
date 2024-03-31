import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
    List<String> result = new ArrayList<>();

    public static void solve(int idx, String digits, String temp) {

        Map<String, String> numberMap = new HashMap<>();

        numberMap.put("2", "abc");
        numberMap.put("3", "def");
        numberMap.put("4", "ghi");
        numberMap.put("5", "jkl");
        numberMap.put("6", "mno");
        numberMap.put("7", "pqrs");
        numberMap.put("8", "tuv");
        numberMap.put("9", "wxyz");

        String ch = String.valueOf(digits.charAt(idx));
        String str = numberMap.get(ch);

        StringBuilder tempBuilder = new StringBuilder(temp);
        for (int i = 0; i < str.length(); i++) {
            tempBuilder.append(str.charAt(i));
            temp = tempBuilder.toString();
        }



    }

    public List<String> letterCombinations(String digits) {

        return result;
    }
}
