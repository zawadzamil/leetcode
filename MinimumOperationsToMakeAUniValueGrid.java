import java.util.ArrayList;
<<<<<<< Updated upstream
import java.util.List;
import java.util.Objects;

public class MinimumOperationsToMakeAUniValueGrid {

    public int minOperations(int[][] grid, int x) {

        List<Integer> list = new ArrayList<>();

        for (int[] ints : grid) {
            for (int anInt : ints) {
                list.add(anInt);
            }
        }
        boolean allSame = true;
        boolean sameReminder = true;
        int first = list.getFirst();
        int firstReminder = list.getFirst() % x;
        for (Integer i : list) {
            if (!Objects.equals(i, first)) {
                allSame = false;
            }
            if(i% x != firstReminder) {
                sameReminder = false;
            }
        }
        if(!sameReminder)  return -1;
        if(allSame) return 0;

        list.sort(Integer::compare);

        double mediun;

        int size = list.size();

        if(size % 2 == 0){
            mediun = (double) (list.get(size / 2) + list.get(size / 2 - 1)) / 2;
        } else {
            mediun = (double) (list.get(size / 2)) ;
        }

        int intMediun = (int)mediun;

        int loweTarget = 0;
        int higherTarget = 0;

        if(list.contains(intMediun)){
            loweTarget = intMediun;
            higherTarget =intMediun;
        }else{
            for (Integer i : list) {
                if(i > mediun){
                    higherTarget = i;
                    loweTarget = list.get(list.indexOf(i) -1);
                    break;
                }
            }
        }

        int lowestSum = Integer.MAX_VALUE;

        int target = higherTarget;
        int sumDistance = 0;

        for (Integer integer : list) {
            int distance = Math.abs(target - integer);
            sumDistance += distance;
        }
        if(sumDistance < lowestSum) {
            lowestSum = sumDistance;
        }

        return lowestSum/x;
=======
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
public class MinimumOperationsToMakeAUniValueGrid {

    public int minOperations(int[][] grid, int x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j]);
            }
        }

        List<Integer> resultCount = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int target = list.get(i);
            AtomicInteger sum = new AtomicInteger();
            AtomicInteger count = new AtomicInteger();
            list.forEach(integer -> {
                if (!Objects.equals(integer, target)) {
                    if (integer > target) {
                        int value = integer;
                        while (value > target) {
                            value -= x;
                            count.addAndGet(1);
                        }
                        if(value == target) {
                            sum.addAndGet(count.get());
                        }else{
                            sum.addAndGet(5000);
                        }

                        count.set(0);
                    } else if (integer < target) {
                        int value = integer;
                        while (value < target) {
                            value += x;
                            count.addAndGet(1);
                        }
                        if(value == target) {
                            sum.addAndGet(count.get());
                        }else{
                            sum.addAndGet(5000);
                        }
                        count.set(0);
                    }

                }
            });
            resultCount.add(sum.get());
        }
        resultCount.sort(Comparator.comparingInt(a -> a));

        if(resultCount.getFirst() >= 5000){
            return -1;
        }

        return resultCount.getFirst();
>>>>>>> Stashed changes
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeAUniValueGrid grid = new MinimumOperationsToMakeAUniValueGrid();
<<<<<<< Updated upstream
        int[][] grid1 = new int[][]{{529,529,989},{989,529,345},{989,805,69}};
        System.out.println( grid.minOperations(grid1, 92));
=======
        int[][] grid1 = new int[][]{{1,2}, {3,4}};
        System.out.println(grid.minOperations(grid1, 2));
>>>>>>> Stashed changes
    }
}
