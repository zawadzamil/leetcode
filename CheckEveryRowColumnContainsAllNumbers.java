import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CheckEveryRowColumnContainsAllNumbers {
    public boolean checkValid(int[][] matrix) {
        HashMap<Integer, HashSet<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> colMap = new HashMap<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (rowMap.containsKey(row) && rowMap.get(row).contains(matrix[row][col])
                        || colMap.containsKey(col) && colMap.get(col).contains(matrix[row][col])) {

                    return false;
                }

                if (rowMap.containsKey(row)) {
                    HashSet<Integer> rowSet = rowMap.get(row);
                    rowSet.add(matrix[row][col]);
                    rowMap.replace(row, rowSet);
                } else {
                    rowMap.put(row, new HashSet<>(List.of(matrix[row][col])));
                }

                if (colMap.containsKey(col)) {
                    HashSet<Integer> columnSet = colMap.get(col);
                    columnSet.add(matrix[row][col]);
                    colMap.replace(col, columnSet);
                } else {
                    colMap.put(col, new HashSet<>(List.of(matrix[row][col])));
                }

            }

        }
        return true;
    }

    public static void main(String[] args) {
        CheckEveryRowColumnContainsAllNumbers checkEvery = new CheckEveryRowColumnContainsAllNumbers();
        int[][] matrix = {
                {1, 1, 1},
                {1, 2, 3},
                {1, 2, 3}
        };

        System.out.println(checkEvery.checkValid(matrix));
    }
}
