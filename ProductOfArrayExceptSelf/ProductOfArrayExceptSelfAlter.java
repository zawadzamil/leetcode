package ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelfAlter {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int[] leftMultiplication = new int[nums.length];
        int[] rightMultiplication = new int[nums.length];

        leftMultiplication[0] = nums[0];
        rightMultiplication[nums.length -1] = 1;

        int leftMult = nums[0];
        for (int i = 1; i < nums.length; i++) {
            leftMult *= nums[i];
            leftMultiplication[i] = leftMult;
        }


        for (int i = nums.length - 2; i >= 0; i--) {
            rightMultiplication[i] = rightMultiplication[i + 1] * nums[i +1];
        }

        System.out.println(Arrays.toString(leftMultiplication));
        System.out.println(Arrays.toString(rightMultiplication));

        for (int i = 0; i < nums.length; i++) {
            result[i] = leftMultiplication[i] * rightMultiplication[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelfAlter productOfArrayExceptSelf = new ProductOfArrayExceptSelfAlter();

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(nums)));
    }
}
