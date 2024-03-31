public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] != val) {
                nums[res] = nums[i];
                res ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RemoveElement objects = new RemoveElement();
        int[] array = {3,2,2,3};
        System.out.println(objects.removeElement(array,3));
    }
}
