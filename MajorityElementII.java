import java.util.*;

public class MajorityElementII {

    public List<Integer> majorityElement(int[] nums) {

        Arrays.sort(nums);

        if (nums.length < 3) {
            if (nums.length == 2) {
                if (nums[0] == nums[1]) {
                    return List.of(nums[0]);
                }
            }
            List<Integer> intList = new ArrayList<>(nums.length);
            for (int i : nums) {
                intList.add(i);
            }

            return intList;
        }
        int buffer = 1;

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                buffer++;
                if (buffer > nums.length / 3) {
                    result.add(nums[i]);
                    while (i < nums.length - 1 && nums[i + 1] == nums[i]) {
                        i++;
                    }
                }
            } else {
                buffer = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MajorityElementII majorityElement = new MajorityElementII();
        int[] nums = {1,1,1,2,2,2};
        System.out.println(majorityElement.majorityElement(nums));
    }
}
