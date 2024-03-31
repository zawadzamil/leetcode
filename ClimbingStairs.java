public class ClimbingStairs {
    public int climbStairs(int n) {
        int first = 1;
        int second = 1;
        int third =0;

        if(n<2){
            return 1;
        }

        for(int i=2;i<=n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static void main(String[] args) {

    }
}
