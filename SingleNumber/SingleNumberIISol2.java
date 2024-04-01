package SingleNumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleNumberIISol2 {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                while (nums[i] == nums[i + 1])
                    i++;
            }
            if (i == 0) return nums[i];
            if (nums[i] != nums[i - 1]) return nums[i];
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        SingleNumberIISol2 singleNumber = new SingleNumberIISol2();
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber.singleNumber(nums));
    }
}
