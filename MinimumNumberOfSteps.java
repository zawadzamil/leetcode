import java.util.ArrayList;
import java.util.List;

import static javax.swing.UIManager.put;

public class MinimumNumberOfSteps {

    public int minSteps(String s, String t) {

        int count = 0;

        List<Character> charList = new ArrayList<>() {{
            for (String s : s.split("")) {
                add(s.charAt(0));
            }
        }};

        System.out.println(charList);

        for (String string : t.split("")) {
            if (charList.contains(string.charAt(0))) {
                charList.remove(string.charAt(0));
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumNumberOfSteps minimumNumberOfSteps = new MinimumNumberOfSteps();

        String s = "bab";
        String t = "aba";

        System.out.println(minimumNumberOfSteps.minSteps(s, t));

    }
}
