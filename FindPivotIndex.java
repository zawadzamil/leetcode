public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (i == 0) {
                left[i] = nums[i];
                right[j] = nums[j];
                continue;
            }
            left[i] = left[i - 1] + nums[i];
            right[j] = right[j + 1] + nums[j];
        }
//        System.out.println(Arrays.toString(left));
//        System.out.println(Arrays.toString(right));

        for (int i = 0; i < nums.length; i++) {
            if (left[i] == right[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex f = new FindPivotIndex();
        int[] nums = new int[]{1,7,3,6,5,6};
        System.out.println(f.pivotIndex(nums));
    }
}
