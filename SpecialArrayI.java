public class SpecialArrayI {
    public boolean isArraySpecial(int[] nums) {
        if (nums.length <= 1) return true;

        int i = 0, j = 1;

        while (j < nums.length) {
            if (nums[i] % 2 == 0 && nums[j] % 2 == 0) return false;
            if (nums[i] % 2 != 0 && nums[j] % 2 != 0) return false;

            i++;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        SpecialArrayI check = new SpecialArrayI();
        int[] nums = new int[]{1};
        System.out.println(check.isArraySpecial(nums));
    }
}
