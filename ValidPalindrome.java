public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String newString = s.toLowerCase();
        newString = newString.replaceAll("[^A-Za-z0-9]", "");

        int i = 0, j = newString.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (newString.charAt(i) != newString.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
