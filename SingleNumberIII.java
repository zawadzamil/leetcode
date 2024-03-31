import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int[] result = new int[2];
        AtomicInteger i = new AtomicInteger(0);
        map.forEach((key, value) -> {
            if (value == 1) {
                result[i.get()] = key;
                i.getAndIncrement();
            }
        });
        return result;
    }

    public static void main(String[] args) {
        SingleNumberIII singleNumber = new SingleNumberIII();
        int[] nums = {-1,0};
        System.out.println(Arrays.toString(singleNumber.singleNumber(nums)));
    }
}
