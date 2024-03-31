import java.util.Scanner;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 ||(x!=0 && x%10==0)) return false;
        int reversed = 0;
        int n = x;
        int remainder = 0;
        while (n != 0) {
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;
        }
        return  x == reversed;
    }

    public static void main(String[] args) {
        PalindromeNumber test = new PalindromeNumber();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(test.isPalindrome(n));
    }
}
