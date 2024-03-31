public class TrappingRainWater {
    public int trap(int[] height) {

        int i = 0;
        int j = 0;
        int result = 0;
        while (i < height.length - 1 && j < height.length) {
            if (height[i] == 0) {
                ++i;
                j = i;
                continue;
            }
            boolean isIhighest = true;

            int temp = i;
            int currentHighest = height[temp + 1];
            for (int k = temp + 1; k < height.length; k++) {
                if (height[k] >= height[i]) {
                    j = k;
                    isIhighest = false;
                    break;
                }
                if (height[k] >= height[temp] && height[k] > currentHighest) {
                    j = k;
                    isIhighest = false;
                    currentHighest = height[k];
                }
                temp = k;
            }

            if (isIhighest) {
                i++;
                j = i;
                continue;
            }


            int d = j - i - 1;
            int minHeight = Math.min(height[i], height[j]);
            int area = minHeight * d;
            int existingBlocksBetween = 0;
            for (int k = i + 1; k < j; k++) {
                int extraArea = 0;
                if (height[k] > minHeight) {
                    extraArea = height[k] - minHeight;
                }
                existingBlocksBetween += height[k] - extraArea;
            }

            area -= existingBlocksBetween;
            result += area;
            i = j;
        }

        return result;
    }

    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        int[] height = {4,2,0,3,2,5};

        System.out.println(trappingRainWater.trap(height));
    }
}
