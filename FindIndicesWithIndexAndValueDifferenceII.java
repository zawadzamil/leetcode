import java.util.Arrays;

public class FindIndicesWithIndexAndValueDifferenceII {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        if (nums.length <= 1) {
            if (0 >= valueDifference) {
                if (indexDifference == 0) {
                    return new int[]{0, 0};
                } else return new int[]{-1, -1};
            }
        }

        if (nums.length - indexDifference < 0)
            return new int[]{-1, -1};

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length - indexDifference; i++) {
            int j = i + indexDifference;
            if (nums[i] <= nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] >= nums[maxIndex]) {
                maxIndex = i;
            }
            if (Math.abs(nums[maxIndex] - nums[j]) >= valueDifference) {
                return new int[]{maxIndex, j};
            }
            if (Math.abs(nums[minIndex] - nums[j]) >= valueDifference){
                return new int[]{minIndex, j};
            }

        }
        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        FindIndicesWithIndexAndValueDifferenceII valueDifference = new FindIndicesWithIndexAndValueDifferenceII();

        int[] nums = new int[]{1,2,3};

        System.out.println(Arrays.toString(valueDifference.findIndices(nums, 2, 4)));
    }

}
