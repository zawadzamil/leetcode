public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public int maximumCount(int[] nums) {
        int length = nums.length;

        if (length == 0) return 0;
        if (length == 1) {
            return nums[0] == 0 ? 0 : 1;
        }

        int posCount = 0;
        int negCount = 0;

        for (int num : nums) {
            if (num > 0) posCount++;
            if (num < 0) negCount++;
        }

        return Math.max(posCount, negCount);
    }

    public static void main(String[] args) {
        MaximumCountOfPositiveIntegerAndNegativeInteger m = new MaximumCountOfPositiveIntegerAndNegativeInteger();
        int[] nums = {0};
        System.out.println(m.maximumCount(nums));
    }
}
