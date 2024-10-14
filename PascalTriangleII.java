import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {

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


    public List<Integer> getRow(int rowIndex) {

        List<Integer> res = new ArrayList<>();
        if (rowIndex == 0){
            res.add(1);
            return res;
        }

        for (int i = 0; i <= rowIndex; i++) {
           res.add((int)ncr(rowIndex, i));
        }
        return res;

    }


    public static void main(String[] args) {

        PascalTriangleII pt = new PascalTriangleII();
        System.out.println(pt.getRow(3));


    }
}
