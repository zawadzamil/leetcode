import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int k) {

        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();

        for (int[] point : points) {
            int square = (int) (Math.pow(point[0], 2) + Math.pow(point[1], 2));
            if (map.containsKey(square)) {
                List<List<Integer>> list = map.get(square);
                list.add(List.of(point[0], point[1]));
                map.replace(square, list);
            }
            map.put(square, List.of(List.of(point[0], point[1])));
        }

        map.entrySet().stream().sorted((o1, o2) -> o2.getKey() - o1.getKey());

        int[][] res = new int[k][2];
        AtomicInteger i = new AtomicInteger();
        map.forEach((key, v) -> {
            if (i.get() < k) {
                v.forEach(integers -> {
                    int[] example1 = integers.stream().mapToInt(j->j).toArray();
                    res[i.get()] =example1;
                    i.getAndIncrement();
                });
            }

        });

        return res;
    }

    public static void main(String[] args) {
        KClosestPointsToOrigin kClosestPointsToOrigin = new KClosestPointsToOrigin();
        int[][] points = new int[][]{{0, 1}, {1, 0}};
        System.out.println(Arrays.deepToString(kClosestPointsToOrigin.kClosest(points, 2)));
    }
}
