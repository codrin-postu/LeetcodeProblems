package net.withur;

public class TrappingRainWater {
    public int trap(int[] height) {
        var trappedWater = 0;
        int left = 0, right = height.length - 1, maxLeft = 0, maxRight = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (maxLeft < height[left]) {
                    maxLeft = height[left];
                } else {
                    trappedWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (maxRight < height[right]) {
                    maxRight = height[right];
                } else {
                    trappedWater += maxRight - height[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
}
