import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        int initialDevider = 1;
        initialDevider = getInitialDevider(num, list, initialDevider);

        StringBuilder result = new StringBuilder();

        while (num > 0) {
            num = num - initialDevider;
            result.append(map.get(initialDevider));
            initialDevider = getInitialDevider(num, list, initialDevider);
        }
        return result.toString();


    }

    private static int getInitialDevider(int num, ArrayList<Integer> list, int initialDevider) {
        if (num >= 1000) {
            return 1000;
        }
        for (int i = 0; i < list.size(); i++) {
            if (num >= list.get(i)) {
                continue;
            } else {
                if (i - 1 >= 0) {
                    initialDevider = list.get(i - 1);
                } else {
                    initialDevider = list.get(i);
                }
                break;
            }

        }
        return initialDevider;
    }

    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.intToRoman(1994));
    }
}
