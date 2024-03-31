import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        BigDecimal[] a = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            a[i] = new BigDecimal(s[i]);
        }
        sc.close();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) < 0) {
                    BigDecimal temp = a[j];
                    String temsString = s[j];
                    a[j] = a[i];
                    s[j] = s[i];
                    a[i] = temp;
                    s[i] = temsString;
                }
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
