public class JumpGameII {
    public int jump(int[] nums) {
        int currentReach = 0;
        int maxReach = 0;
        int count = 0;
        if (nums.length < 2) {
            return 0;
        }
        if (nums.length == 2) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            maxReach = Math.max(nums[i] + i, maxReach);

            if (i == currentReach && currentReach < nums.length - 1) {
                currentReach = maxReach;
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        JumpGameII game = new JumpGameII();

        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(game.jump(nums));
    }
}
