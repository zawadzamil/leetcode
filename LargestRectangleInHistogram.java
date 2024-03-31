import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {

        Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            if (stack.isEmpty()) {
                stack.push(new AbstractMap.SimpleEntry<>(i, heights[i]));
                continue;
            }
            if (heights[i] < stack.peek().getValue()) {

                while (!stack.isEmpty() && heights[i] < stack.peek().getValue()) {

                    int areaCovered = (i - stack.peek().getKey()) * stack.peek().getValue();
                    maxArea = Math.max(maxArea, areaCovered);

                    System.out.println(stack);
                    stack.pop();
                }

                stack.push(new AbstractMap.SimpleEntry<>(i, heights[i]));

            } else {
                stack.push(new AbstractMap.SimpleEntry<>(i, heights[i]));
            }

        }

        if (!stack.isEmpty()) {
            while (!stack.isEmpty()) {
                maxArea = Math.max(maxArea, (heights.length - stack.peek().getKey()) * stack.peek().getValue());
                stack.pop();
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();
        int[] heights = {2,1,2};

        System.out.println(largestRectangleInHistogram.largestRectangleArea(heights));
    }
}
