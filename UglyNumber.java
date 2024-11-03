import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Zawad Zamil
 * Date: 10/27/24
 * Time: 12:55 PM
 * Email: zawad@zaagsys.com
 */
public class UglyNumber {

    public boolean isUgly(int n) {

        if(n == 0) return false;

        while (n >= 0) {
            if (n == 1) return true;
            if (n % 2 == 0) n /= 2;
            else if (n % 3 == 0) n /= 3;
            else if (n % 5 == 0) n /= 5;
            else return false;
        }
        return false;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumberII = new UglyNumber();
        System.out.println(uglyNumberII.isUgly(14));
    }
}
