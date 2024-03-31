import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
      int i = 0;
      for(int j=1; j<nums.length; j++) {
          if(nums[i] != nums[j]){
              i++;
          }
          nums[i] = nums[j];
      }
      return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray object = new RemoveDuplicateFromSortedArray();
        int[] numbers = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(object.removeDuplicates(numbers));
    }
}
