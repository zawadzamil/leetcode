package ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainingDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }
        return unique.size() != nums.length;

    }

    public static void main(String[] args) {
        ContainingDuplicate containingDuplicate = new ContainingDuplicate();

        int[] nums = {1,2,3,4};
        System.out.println(containingDuplicate.containsDuplicate(nums));
    }
}
