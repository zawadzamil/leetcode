import java.util.Arrays;

public class MajorityElement {
    public  int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort (nums);
        int n = nums.length;
        int buffer = 1;
        int bufferMax = 0;
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                buffer++;
                if ( buffer > bufferMax) {
                    result = nums[i];
                    bufferMax = buffer;
                }
            } else {
                if ( buffer > bufferMax) {
                    result = nums[i];
                    bufferMax = buffer;
                }
                buffer = 1;
            }

        }

        return result;
    }
}
