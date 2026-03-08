public class CheckIfNumberSumOfPowersOfThree {
    public boolean checkPowersOfThree(int n) {

        int lastNumber = 0;

        while (Math.pow(3, lastNumber) <= n) {
            lastNumber++;
        }

        lastNumber -= 1;

        double sum = 0;

        for (int i = lastNumber; i >= 0; i--) {
            if (sum + Math.pow(3, i) > n) {
                continue;
            }
            sum += Math.pow(3, i);
            if (sum == n) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CheckIfNumberSumOfPowersOfThree check = new CheckIfNumberSumOfPowersOfThree();
        System.out.println(check.checkPowersOfThree(27));
    }
}
