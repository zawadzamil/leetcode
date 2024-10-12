import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    static BigInteger factorial(int n) {
        BigInteger res = new BigInteger("1");
        int i;
        for (i = 2; i <= n; i++)
            res = res.multiply(BigInteger.valueOf(i));
        return res;
    }

    static long ncr(int n, int r) {
        BigInteger factorialN = factorial(n);
        BigInteger factorialR = factorial(r);
        BigInteger factorialNR = factorial(n - r);
        return factorialN.divide(factorialR.multiply(factorialNR)).intValue();
    }


    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) {
            return res;
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add((int) ncr(i, j));

            }
//            System.out.println(list);
            res.add(list);
            list.clear();
        }

        return res;
    }


    public static void main(String[] args) {

        PascalTriangle pt = new PascalTriangle();
        System.out.println(pt.generate(22));
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println(ncr(13,1));


    }
}
