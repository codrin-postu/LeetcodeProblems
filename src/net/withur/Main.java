package net.withur;

import java.util.Arrays;
import java.util.List;

/*
I am aware that some of the classes have very long names. I just want to keep the names close to the problem titles
to search for them easier on leetCode.
 */

public class Main {

    public static void main(String[] args) {
        PalindromeNumberData();
    }

    private static void PalindromeNumberData() {
        int number = 2;
        var problem = new PalindromeNumber();
        System.out.println(problem.isPalindrome(number));
    }

    private static void FourSumData() {
        int[] nums = {1,0,-1,0,-2,2};
        var problem = new FourSum();
        var target = 0;
        List<List<Integer>> results = problem.fourSum(nums, target);
        for (List<Integer> result: results
        ) {
            System.out.println(result);
        }
    }

    private static void ThreeSumData() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum problem = new ThreeSum();
        List<List<Integer>> results = problem.threeSum(nums);
        for (List<Integer> result: results
             ) {
            System.out.println(result);
        }
    }

    private static void TrappingRainWaterData() {
        int[] height = {0,2,1};
        var problem = new TrappingRainWater();
        System.out.println(problem.trap(height));
    }

    private static void ContainerMostWaterData() {
        int[] input = {4, 3 , 2, 1, 4};
        var problem = new ContainerMostWater();
        System.out.println(problem.maxArea(input));
    }

    private static void LongestSubstrNoRepChData() {
        String input = "abcabdcbb";
        LongestSubstringNoRepeatCharSolution problem = new LongestSubstringNoRepeatCharSolution();
        System.out.println(problem.lengthOfLongestSubstring(input));
    }

    private static void ReverseIntegerData() {
        int num = -123;
        ReverseIntegerSolution problem = new ReverseIntegerSolution();
        System.out.println(problem.reverse(num));
    }

    private static void TwoSumData() {
        TwoSumSolution problem = new TwoSumSolution();
        int[] nums = {3, 2 ,4};
        int target = 6;
        System.out.println(Arrays.toString(problem.twoSumHash(nums, target)));
    }

    private static void AddTwoNumbersData() {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();

        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode();

        l1.val = 2; l1.next = l2;
        l2.val = 4; l2.next = l3;
        l3.val = 3;

        l4.val = 5; l4.next = l5;
        l5.val = 6; l5.next = l6;
        l6.val = 4;

        AddTwoNumbersSolution problem = new AddTwoNumbersSolution();
        ListNode l7 = problem.addTwoNumbers(l1, l4);

    }
}
