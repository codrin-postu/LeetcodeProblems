package net.withur;

import java.util.Arrays;

/*
I am aware that some of the classes have very long names. I just want to keep the names close to the problem titles
to search for them easier on leetCode.
 */

public class Main {

    public static void main(String[] args) {
        LongestSubstrNoRepChData();
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
