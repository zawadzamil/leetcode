import java.util.LinkedHashMap;
import java.util.Scanner;

public class RomanToInteger {
    public int romanToInteger(String s) {
        LinkedHashMap<Character, Integer> roman = new LinkedHashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                Character c = s.charAt(i);
                if (roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))) total += roman.get(s.charAt(i));
                else {
                    total = total - roman.get(s.charAt(i));
                }
            } else {
                total += roman.get(s.charAt(i));
            }
        }
        return total;
    }

    public static void main(String[] args) {
        RomanToInteger roman = new RomanToInteger();
        Scanner scanner = new Scanner(System.in);
        String romanString = scanner.nextLine();

        System.out.println(roman.romanToInteger(romanString));

    }
}
