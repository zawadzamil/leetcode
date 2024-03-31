import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        for (int i : digits) {
            list.add(i);
        }
        int lastIndex = list.size() - 1;
        int sum = digits[lastIndex] + 1;
        int carry = 0;
        if (sum > 9) carry = 1;
        else{
            digits[lastIndex] = sum;
            return digits;
        }

        for (int i = lastIndex; i >= 0; i--) {
            if (digits[i] + carry > 9) {
                list.set(i, 0);
            } else {
                list.set(i, digits[i] + carry);
                carry = 0;
            }
        }

        if (carry == 1) {
            list.add(0,1);
        }

        int[] resArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resArray[i] = list.get(i);
        }

        return resArray;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }

}
