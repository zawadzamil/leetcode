public class MaximumValueOfAnOrderedTripletI {

    public long maximumTripletValue(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] > nums[i]) continue;
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((long) (nums[i] - nums[j]) * nums[k] > max)
                        max = (long) (nums[i] - nums[j]) * nums[k];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumValueOfAnOrderedTripletI maxValue = new MaximumValueOfAnOrderedTripletI();

        int[] nums = new int[]{1000000, 1, 1000000};
        System.out.println(maxValue.maximumTripletValue(nums));

    }
}
