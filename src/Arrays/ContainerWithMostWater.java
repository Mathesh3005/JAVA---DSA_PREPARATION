package Arrays;

//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49

public class ContainerWithMostWater {
    public static void maxArea(int[] height) {
        int start = 0;
        int last = height.length - 1;
        int max = 0;

        while (start < last) {
            int width = last - start;
            int minHeight = Math.min(height[start], height[last]);
            int area = width * minHeight;
            if (area > max) {
                max = area;
            }
            if (height[start] < height[last]) {
                start++;
            } else {
                last--;
            }
        }
        System.out.print(max);
    }
}
