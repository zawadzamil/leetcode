import java.util.Arrays;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for (int i = 1; i < temperatures.length - 1; i++) {
            int j = i - 1;
            while (j >= 0) {
                if (temperatures[j] < temperatures[i]) {
                    if (result[j] == 0) {
                        result[j] = i - j;
                        break;
                    }
                }
                j--;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(temp)));
    }
}
