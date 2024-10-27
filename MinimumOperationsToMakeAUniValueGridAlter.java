import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by IntelliJ IDEA.
 * User: Zawad Zamil
 * Date: 10/21/24
 * Time: 4:56 PM
 * Email: zawad@zaagsys.com
 */
public class MinimumOperationsToMakeAUniValueGridAlter {

    int binarySearch(int arr[], int x, List<Integer> list) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;
            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;
                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }
        // If we reach here, then element was
        // not present
        if (list.get(low) - x < list.get(high) - x) {
            return low;
        } else return high;
    }

    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        for (int[] ints : grid) {
            for (int anInt : ints) {
                list.add(anInt);
            }
        }

        boolean unique = true;
        int uniqueNumber = list.getFirst();
        int commonReminder = uniqueNumber % x;

        for (Integer i : list) {
            if (i != uniqueNumber) {
                unique = false;
            }
            if (i % x != commonReminder) {
                return -1;
            }
        }
        if (unique) return 0;

        List<Integer> resultCount = new ArrayList<>();

        list.sort(Comparator.comparingInt(o -> o));

        double median;
        int size = list.size();
        if (size % 2 == 0)
            median = (double) (list.get(size / 2) + list.get(size - 1) / 2) / 2.0;
        else
            median = (double) list.get(size / 2);


        int target = list.get((int) median);

        if (list.contains((int) median)) {
            target = (int) median;
        } else {
//                int i = list.size() /2;
            for (int i = 0; i < lis; i++) {

            }
        }


//        int sum = 0;
//        for (Integer integer : list) {
//            int distance = Math.abs(target - integer);
//            sum += distance;
//        }
//        resultCount.add(sum);


//        resultCount.sort(Comparator.comparingInt(o -> o));
//
//        int result = resultCount.getFirst() / x;
//
//        return result > 2 ? -1 : result;

        return 0;
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeAUniValueGridAlter grid = new MinimumOperationsToMakeAUniValueGridAlter();
        int[][] grid1 = new int[][]{{2, 4}, {6, 8}};
        System.out.println(grid.minOperations(grid1, 2));
    }
}
