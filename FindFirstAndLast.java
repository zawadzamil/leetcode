import java.util.Arrays;

public class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {

        int start = -1;
        int end = -1;
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (nums[m] == target) {
                if (start == -1) start = m;
                else end = m;
                l += 1;
                continue;
            }


            // If x greater, ignore left half
            if (nums[m] < target)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        if (end == -1 && start != -1) end = start;

        return Arrays.stream(new int[]{start, end}).sorted().toArray();
    }

    public static void main(String[] args) {
        FindFirstAndLast findFirstAndLast = new FindFirstAndLast();
        int[] nums = {2, 2};

        System.out.println(Arrays.toString(findFirstAndLast.searchRange(nums, 2)));
    }
}
