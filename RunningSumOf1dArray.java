import java.util.Arrays;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray sumOf1dArray = new RunningSumOf1dArray();

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sumOf1dArray.runningSum(nums)));
    }
}
