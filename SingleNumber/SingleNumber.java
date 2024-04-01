package SingleNumber;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer i : nums) {
            if (!result.containsKey(i)) {
                result.put(i, 1);
            } else {
                result.put(i, result.get(i) + 1);
            }
        }
        AtomicInteger returnValue = new AtomicInteger();
        result.forEach((key, value) -> {
            if (value == 1) {
                returnValue.set(key);
            }
        });

        return returnValue.get();

    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] values = {1};
        System.out.println(singleNumber.singleNumber(values));
    }
}
