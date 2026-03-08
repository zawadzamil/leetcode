public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {

        int res = 0;

        int totalNumberOfElements = 0;

        for (int[] numbers : grid) {
            totalNumberOfElements += numbers.length;
        }

        int[] actual = new int[totalNumberOfElements];

        int position = 0;

        for (int[] numbers : grid) {
            System.arraycopy(numbers, 0, actual, position, numbers.length);
            position += numbers.length;
        }

        for (int j : actual) {
            res += j < 0 ? 1 : 0;
        }
        return res;
    }

    public static void main(String[] args) {
        CountNegativeNumbersInASortedMatrix countNegativeNumbersInASortedMatrix = new CountNegativeNumbersInASortedMatrix();
        int[][] nums = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        System.out.println(countNegativeNumbersInASortedMatrix.countNegatives(nums));
    }
}
