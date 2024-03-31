package ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int multiplication = 1;
        int countZero = 0;

        for (int num : nums) {
            if (num == 0) countZero++;
            multiplication = num != 0 ? multiplication * num : multiplication;
        }

        for (int i = 0; i < nums.length; i++) {
            if(countZero == 1){
                result[i] = nums[i] != 0 ? 0 : multiplication;
            }
            else if(countZero > 1){
                result[i] = 0;
            }
            else {
                result[i] =  multiplication / nums[i];
            }


        }

        return result;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();

        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(nums)));
    }
}
