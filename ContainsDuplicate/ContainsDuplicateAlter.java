package ContainsDuplicate;

import java.util.Arrays;

public class ContainsDuplicateAlter {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        boolean result = false;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                return true;
            }

        }
        return result;

    }

    public static void main(String[] args) {
        ContainingDuplicate containingDuplicate = new ContainingDuplicate();

        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containingDuplicate.containsDuplicate(nums));
    }
}
