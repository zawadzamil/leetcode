import java.util.ArrayList;
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
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeAUniValueGrid grid = new MinimumOperationsToMakeAUniValueGrid();
        int[][] grid1 = new int[][]{{529,529,989},{989,529,345},{989,805,69}};
        System.out.println( grid.minOperations(grid1, 92));
    }
}
