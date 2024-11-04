import java.util.Arrays;

public class RangeSumQueryImmutable {

    int[] nums;

    public void NumArray(int[] nums) {
        int[] prefixSum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) prefixSum[i] = nums[i];
            else {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
        }
        this.nums = prefixSum;
    }

    public int sumRange(int left, int right) {

        System.out.println(Arrays.toString(nums));

        int sum = 0;
        return nums[right] - sum;
    }


    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(nums));

    }
}
