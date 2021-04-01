package net.withur;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;

        while (pos < nums.length) {
            if (pos == nums.length - 1) {
                if (target > nums[pos])
                    return pos + 1;
                else
                    return pos;
            } else if (nums[pos] >= target) return pos;
            else pos++;

        }
        return pos;
    }

//    More efficient. Always cuts the size in half if it is mid is higher than target
    public int searchInsert2(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
}
