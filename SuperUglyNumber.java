import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: Zawad Zamil
 * Date: 11/3/24
 * Time: 12:53 PM
 * Email: zawad@zaagsys.com
 */
public class SuperUglyNumber {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp = new long[n];

        if (n <= 1)
            return 1;
        dp[0] = 1;

        Map<Integer, Integer> map = new HashMap<>();

        for (int prime : primes) {
            map.put(prime, 0);
        }

//        System.out.println(map);

        for (int i = 1; i < n; i++) {
            Map<Integer, Long> list = new HashMap<>();
            map.forEach((prime, index) -> list.put(prime, (long) (dp[index] * prime)));

            // Convert the HashMap to a list of Map.Entry objects
            List<Map.Entry<Integer, Long>> entryList = new ArrayList<>(list.entrySet());

            // Sort the list by values in ascending order
            entryList.sort(Map.Entry.comparingByValue());

            // Create a new LinkedHashMap to store the sorted entries
            LinkedHashMap<Integer, Long> sortedMap = new LinkedHashMap<>();
            for (Map.Entry<Integer, Long> entry : entryList) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            Integer firstPrime = sortedMap.keySet().stream().findFirst().get();

            dp[i] = list.get(firstPrime);

            int j = i;
            map.forEach((key, value) -> {
                if (dp[j] % key == 0) {
                    map.replace(key, value + 1);
                }
            });

        }
//        System.out.println(Arrays.toString(dp));
        return (int) dp[n - 1];

    }

    public static void main(String[] args) {
        SuperUglyNumber sup = new SuperUglyNumber();
        System.out.println(sup.nthSuperUglyNumber(5911, new int[]{2, 3, 5, 7}));
    }
}
