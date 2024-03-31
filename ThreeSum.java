import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int l, r;
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            l = i + 1;
            r = nums.length - 1;

            while (l < r) {
//                System.out.println(nums[i] + " " + nums[l] + " " + nums[r]);
                if (nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);
                    newList.add(nums[l]);
                    newList.add(nums[r]);

                    result.add(newList);
                    l++;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        List<List<Integer>> finalList = new ArrayList<>(result);
        return finalList;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] n = {0, 0, 0, 0};

        System.out.println(threeSum.threeSum(n));
    }
}
