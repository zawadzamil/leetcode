import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> rowMap = new HashMap<>();
        HashMap<Integer, HashSet<Integer>> colMap = new HashMap<>();
        HashMap<Point, HashSet<Integer>> square = new HashMap<>();

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] == '.') continue;

                if (rowMap.containsKey(row) && rowMap.get(row).contains((int) board[row][column])
                        || colMap.containsKey(column) && colMap.get(column).contains((int) board[row][column])
                        || square.containsKey(new Point(row / 3, column / 3))
                        && square.get(new Point(row / 3, column / 3)).contains((int) board[row][column])) {
                    return false;
                }
                if (rowMap.containsKey(row)) {
                    HashSet<Integer> rowSet = rowMap.get(row);
                    rowSet.add((int) board[row][column]);
                    rowMap.replace(row, rowSet);
                } else {
                    rowMap.put(row, new HashSet<Integer>(List.of((int) board[row][column])));
                }

                if (colMap.containsKey(column)) {
                    HashSet<Integer> columnSet = colMap.get(column);
                    columnSet.add((int) board[row][column]);
                    colMap.replace(column, columnSet);
                } else {
                    colMap.put(column, new HashSet<>(List.of((int) board[row][column])));
                }
                if (square.containsKey(new Point(row / 3, column / 3))) {
                    HashSet<Integer> squareSet = square.get(new Point(row / 3, column / 3));
                    squareSet.add((int) board[row][column]);
                    square.replace(new Point(row / 3, column / 3), squareSet);
                } else {
                    square.put(new Point(row / 3, column / 3), new HashSet<>(List.of((int) board[row][column])));
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        ValidSudoku sudoku = new ValidSudoku();

        char[][] sudokuBoard = {
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(sudoku.isValidSudoku(sudokuBoard));

    }
}
