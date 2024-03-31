import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static boolean isPalindrome(String str){
        int left=0;
        int right= str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right) ) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxLength = 0;
       String answer = "";

        if(s.length() == 1){
            return  s;
        }

        boolean beforePalindrom = isPalindrome(s);
        if(beforePalindrom){
            return s;
        }

        for (int i = 0; i <= s.length() ; i++) {
           int j = s.length();
           while(i<j) {
               String substring = s.substring(i, j);
               boolean isPalindrome = isPalindrome(substring);
               if (isPalindrome) {
                   int count = substring.length();
                   if(count > maxLength){
                       answer = substring;
                       maxLength = count;
                   }
               }
               j--;
           }
        }
        return answer;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring object = new LongestPalindromicSubstring();

        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Read the user's input

        String result = object.longestPalindrome(inputString); // Find the longest palindromic substring

        System.out.println("Longest palindromic substring: " + result);

        scanner.close(); // Close the Scanner to release resources
    }
}
