import java.util.Arrays;

public class MaximumNumberOfPairsInArray {

    public int[] numberOfPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && (nums[j] != -5000 || nums[i] != -5000)) {
                    nums[i] = -5000;
                    nums[j] = -5000;
                    count++;
                }
            }
        }
        int[] res = new int[2];
        res[0] = count;
        res[1] = nums.length - count *2;
        return res;

    }

    public static void main(String[] args) {
        MaximumNumberOfPairsInArray mn = new MaximumNumberOfPairsInArray();
        System.out.println(Arrays.toString(mn.numberOfPairs(new int[]{0})));

    }
}
