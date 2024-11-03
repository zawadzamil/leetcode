import java.util.ArrayList;
import java.util.List;

public class UglyNumberII {
    static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public int nthUglyNumber(int n) {

        if (n <= 1) return 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int ugly = 2;
        while (list.size() < n) {
            if (ugly % 2 == 0 || ugly % 3 == 0 || ugly % 5 == 0) {
                boolean isUgly = true;
                if (ugly > 7) {
                    for (int i = 7; i < ugly; i++) {
                        if (ugly % i == 0 && isPrime(i)) {
                            isUgly = false;
                            break;
                        }
                    }
                }

                if (isUgly) {
                    list.add(ugly);
                }
            }
            ugly++;
        }
        System.out.println(list);
        return list.getLast();
    }

    public static void main(String[] args) {
        UglyNumberII uglyNumberII = new UglyNumberII();
        System.out.println(uglyNumberII.nthUglyNumber(20));
    }
}
