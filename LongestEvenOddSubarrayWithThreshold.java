public class LongestEvenOddSubarrayWithThreshold {

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int result = 0;
        int checkCurrentEvenOrOdd = 0;
        boolean initialized = true;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == checkCurrentEvenOrOdd) {
                if (initialized) {
                    result++;
                    initialized = false;
                } else {
                    if (i < nums.length - 1 && nums[i + 1] != checkCurrentEvenOrOdd && nums[i] <= threshold) {
                        result++;
                        checkCurrentEvenOrOdd = checkCurrentEvenOrOdd == 0 ? 1 : 0;
                    }
                    else {
                        initialized = true;
                    }
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestEvenOddSubarrayWithThreshold longestEvenOddSubarrayWithThreshold = new LongestEvenOddSubarrayWithThreshold();
        int[] nums = new int[]{3, 2, 5, 4};

        System.out.println(longestEvenOddSubarrayWithThreshold.longestAlternatingSubarray(nums, 5));
    }
}
