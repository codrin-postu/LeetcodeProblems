package net.withur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 4, 0);
    }

    private List<List<Integer>> kSum(int[] nums, int target, int k, int index) {
        List<List<Integer>> result = new ArrayList<>();
        if (k == 2) {
            int low = index;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[low] + nums[high] == target) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[low]);
                    temp.add(nums[high]);
                    result.add(temp);

                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < target) low++;
                else high--;
            }
        } else {
            for (int i = index; i < nums.length - k + 1; i++) {
                if (nums[i] * k > target) break;
                if (i > index && nums[i] == nums[i - 1]) continue;
                List<List<Integer>> temp = kSum(nums, target - nums[i], k - 1, i + 1);
                for (List<Integer> t : temp) {
                    t.add(nums[i]);
                }
                result.addAll(temp);

            }
        }
        return result;
    }
}
