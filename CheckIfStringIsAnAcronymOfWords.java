import java.util.ArrayList;
import java.util.List;

public class CheckIfStringIsAnAcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        int i = 0;
        if (words.size() != s.length()) {
            return false;
        }
        for (String word : words) {
            if (word.charAt(0) != s.charAt(i++)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfStringIsAnAcronymOfWords acronymOfWords = new CheckIfStringIsAnAcronymOfWords();

        List<String> words = new ArrayList<>() {{
            add("never");
            add("gonna");
            add("give");
            add("up");
            add("on");
            add("you");
        }};
        String s = "ngguoy";

        System.out.println(acronymOfWords.isAcronym(words, s));
    }
}
