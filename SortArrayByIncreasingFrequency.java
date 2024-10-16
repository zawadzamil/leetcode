import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SortArrayByIncreasingFrequency {

    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((l1, l2) -> l2.getKey().compareTo(l1.getKey()));
        entryList.sort(Map.Entry.comparingByValue());

        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        int[] res = new int[nums.length];
        AtomicInteger index = new AtomicInteger();
        sortedMap.forEach((k, v) -> {
            for (int i = 0; i < v; i++) {
                res[index.get()] = k;
                index.getAndIncrement();
            }
        });

        return res;
    }

    public static void main(String[] args) {
        SortArrayByIncreasingFrequency sortCharactersByFrequency = new SortArrayByIncreasingFrequency();
        int[] nums = {2, 3, 1, 3, 2};
        System.out.println(Arrays.toString(sortCharactersByFrequency.frequencySort(nums)));
    }
}
