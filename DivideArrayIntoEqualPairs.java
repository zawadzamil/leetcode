import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DivideArrayIntoEqualPairs {

    public boolean divideArray(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        AtomicInteger count = new AtomicInteger();
        map.forEach((k, v) -> {
            if(v % 2 == 0){
                count.addAndGet(v / 2);
            }
        });
        return count.get() == nums.length / 2;
    }

    public static void main(String[] args) {
            DivideArrayIntoEqualPairs obj = new DivideArrayIntoEqualPairs();
            System.out.println(obj.divideArray(new int[]{1,2,3,4}));
    }
}
