import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {

        int start = nums.length - (k % nums.length);
        int[] copy = nums.clone();
        int i = 0;

        if (start != 0) {
            while (i < nums.length) {
                if (start <= nums.length - 1) {
                    nums[i] = copy[start];
                    i++;
                    start++;
                }
                 else {
                    start = 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);
    }
}
