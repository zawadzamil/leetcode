public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int j = 0;
        int leftSum = 0;
        int rightSum = 0;

        while ((i < mat.length) && (j < mat.length)) {
            leftSum += mat[i][j];
            i++;
            j++;
        }
        i = 0;
        j = mat.length - 1;

        while ((i < mat.length) && (j >= 0)) {
            if(i==j ) {
                i++;
                j--;
                continue;
            };
            rightSum += mat[i][j];
            i++;
            j--;
        }

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrixDiagonalSum.diagonalSum(mat));


    }
}
