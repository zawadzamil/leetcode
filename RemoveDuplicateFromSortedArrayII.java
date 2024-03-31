import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int currentCount = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {

                i++;
                currentCount = 0;
            } else {
                if (currentCount < 1) {
                    currentCount += 1;
                    i++;
                }

            }
            nums[i] = nums[j];


        }



        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArrayII object = new RemoveDuplicateFromSortedArrayII();
        int[] numbers = {0,0,1,1,1,1,2,3,3};
        System.out.println(object.removeDuplicates(numbers));

    }
}
