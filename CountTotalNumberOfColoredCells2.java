public class CountTotalNumberOfColoredCells2 {
    public long coloredCells(int n) {
        if (n == 1) return 1;

       return 1 + ((long) n * (n + (n-2)));
    }

    public static void main(String[] args) {
        CountTotalNumberOfColoredCells2 check = new CountTotalNumberOfColoredCells2();
        System.out.println(check.coloredCells(69675));
    }
}
