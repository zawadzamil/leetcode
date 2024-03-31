import java.util.HashSet;

public class HappyNumber {

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int newNumber = 0;
            if (n < 10) {
                newNumber = n * n;
                if (newNumber == 1) return true;
            } else {
                while (n > 0) {
                    newNumber += (n % 10) * (n % 10);
                    n = n / 10;
                }

                if (newNumber == 1) return true;
            }
            n = newNumber;
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(19));
    }
}
