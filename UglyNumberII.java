import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UglyNumberII {

    public int nthUglyNumber(int n) {
        if (n <= 1) {
            return n;
        }

        int[] list = new int[n];

        list[0] = 1;
        int indexA = 0, indexB = 0, indexC = 0;
        for (int i = 1; i < n; i++) {
            int a = list[indexA] * 2;
            int b = list[indexB] * 3;
            int c = list[indexC] * 5;

            int min = Math.min(a, Math.min(b, c));
            list[i] = min;

            if (min % 2 == 0) indexA++;
            if (min % 3 == 0) indexB++;
            if (min % 5 == 0) indexC++;
        }
//        System.out.println(list);
        return list[n-1];
    }

    public static void main(String[] args) {
        UglyNumberII uglyNumberII = new UglyNumberII();
        System.out.println(uglyNumberII.nthUglyNumber(11));
    }
}
