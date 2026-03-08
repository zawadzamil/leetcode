public class CountTotalNumberOfColoredCells {
    public long coloredCells(int n) {
        if (n == 1) return 1;

        int res = n + (n - 1);

        int temp = res;
        long tempSum = res;

        while (temp > 1) {
            temp = temp - 2;
            tempSum += temp;
        }
        return tempSum + Math.abs((tempSum - res));
    }

    public static void main(String[] args) {
        CountTotalNumberOfColoredCells check = new CountTotalNumberOfColoredCells();
        System.out.println(check.coloredCells(69675));
    }
}
