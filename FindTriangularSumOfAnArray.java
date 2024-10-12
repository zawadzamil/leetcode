public class FindTriangularSumOfAnArray {

    public int triangularSum(int[] nums) {

        if (nums.length == 1) return nums[0];

        int[] newNums = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            newNums[i] = (nums[i] + nums[i + 1]) % 10;
        }

        return triangularSum(newNums);
    }

    public static void main(String[] args) {

        FindTriangularSumOfAnArray f = new FindTriangularSumOfAnArray();
        int[] n = { 5};
        System.out.println(f.triangularSum(n));

    }
}
