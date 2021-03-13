package net.withur;

public class ContainerMostWater {
    public int maxArea(int[] height) {
        var maxArea = 0;
        var currArea = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            if (height[i] < height[j]) {
                currArea = height[i] * (j - i);
                i++;
            } else {
                currArea = height[j] * (j - i);
                j--;
            }
            maxArea = currArea > maxArea ? currArea : maxArea;
        }
        return maxArea;
    }
}
