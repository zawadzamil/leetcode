class ReverseMyString {
    public static String reverse(String orig) {
        char[] s = orig.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
        return new String(s);
    }
}
public class ReverseWordsInAStringIII {


    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(ReverseMyString.reverse(word)).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIII reverseWords = new ReverseWordsInAStringIII();

        System.out.println(reverseWords.reverseWords("Let's take LeetCode contest"));
    }
}
