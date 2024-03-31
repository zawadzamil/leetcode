import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) return 0;
        int maxSum = 0;
        int sum = 1;

        HashSet<Integer> set = new HashSet<>();
        AtomicInteger i = new AtomicInteger();

        for (int num : nums) {
            set.add(num);
        }
        int[] setArray = new int[set.size()];

        set.forEach(element -> {
            setArray[i.getAndIncrement()] = element;
        });

        Arrays.sort(setArray);

        System.out.println(Arrays.toString(setArray));

        for (int j = 1; j < setArray.length; j++) {

            if (setArray[j] == setArray[j - 1] + 1) {
                sum++;
            } else {
                if (sum > maxSum) maxSum = sum;
                sum = 1;
            }

        }
        if (sum > maxSum) maxSum = sum;


        return maxSum;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int[] nums = {4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3};
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
    }
}
