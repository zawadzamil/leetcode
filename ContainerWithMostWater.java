import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[right], height[left]);
            int distance = right - left;
            int area = minHeight * distance;
            if (area > maxArea) {
                maxArea = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] area = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater.maxArea(area));
    }
}
