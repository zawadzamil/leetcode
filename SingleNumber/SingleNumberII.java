package SingleNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        AtomicInteger result = new AtomicInteger(0);
        map.forEach((key, value) -> {
            if (value == 1) {
                result.set(key);
            }
        });

        return result.get();

    }

    public static void main(String[] args) {
        SingleNumberII singleNumber = new SingleNumberII();
        int[] nums = {-1,0,0};
        System.out.println(singleNumber.singleNumber(nums));
    }
}
