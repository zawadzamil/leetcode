public class MinimumValueToGetPositiveStepbyStepSum {

    public int minStartValue(int[] nums) {
        if (nums.length == 1) return nums[0] > 0 ? 1 : Math.abs(nums[0]) + 1;

        int[] prefixSum = new int[nums.length];

        prefixSum[0] = nums[0];

        int min = prefixSum[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
            if (prefixSum[i] < min) min = prefixSum[i];
        }
        return min > 0 ? 1 : Math.abs(min) + 1;
    }

    public static void main(String[] args) {
        MinimumValueToGetPositiveStepbyStepSum m = new MinimumValueToGetPositiveStepbyStepSum();
        System.out.println(m.minStartValue(new int[]{-3, 6, 2, 5, 8, 6}));
    }
}
