import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int count = 1;
        int left = 0;
        int right = 1;

        if (s.length() < 1) return 0;

        if (s.length() == 1) return 1;

        List<String> charList = new ArrayList<>();
        charList.add(String.valueOf(s.charAt(left)));
        while (right < s.length()) {

            if (!charList.contains(String.valueOf(s.charAt(right)))) {
                charList.add(String.valueOf(s.charAt(right)));
                count = charList.size();
//                System.out.println(charList + " " + s.charAt(right)+ " Size " +count);
            } else {
//                System.out.println(charList + " " + s.charAt(right)+ " Size " +"REJECTED");
                max = Math.max(max, count);
                count = 1;
                left ++;
                right = left;
                charList.clear();
                charList.add(String.valueOf(s.charAt(left)));
            }
            right++;
        }
        max = Math.max(max, count);

        return max;

    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters object = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(object.lengthOfLongestSubstring("abcabcbb"));
    }
}
