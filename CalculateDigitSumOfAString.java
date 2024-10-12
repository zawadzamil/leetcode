import java.util.ArrayList;
import java.util.List;

public class CalculateDigitSumOfAString {

    public String digitSum(String s, int k) {

        if (s.length() <= k) return s;
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i = i + k) {
            if(i+k < s.length()) stringList.add(s.substring(i, i+k));
            else stringList.add(s.substring(i));
        }
        StringBuffer result = new StringBuffer();
        stringList.forEach(s1 -> {
            int sum = 0;
            for (int i = 0; i < s1.length(); i++) {
                sum += Integer.parseInt(String.valueOf(s1.charAt(i)));
            }
            result.append(sum);
        });

       return digitSum(result.toString(), k);
    }


    public static void main(String[] args) {

        CalculateDigitSumOfAString cal = new CalculateDigitSumOfAString();
        System.out.println(cal.digitSum("00000000", 3));
    }
}
