public class JumpGame {


    public boolean canJump(int[] nums) {
        int reachable = 0;
        if (nums.length < 2) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            int jumpedPosition = nums[i] + i;

            if (i > reachable) {
                return false;
            }
            if (jumpedPosition > reachable) {
                reachable = jumpedPosition;
            }
            if (jumpedPosition >= nums.length -1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        int[] nums = {3,2,1,0,4};

        System.out.println(jumpGame.canJump(nums));
    }
}
