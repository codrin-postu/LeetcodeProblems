package net.withur;

public class AddTwoNumbersSolution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = new ListNode();
        ListNode origin = current;
        int i, j, carry = 0;
        while(l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            current.next = new ListNode(sum %10);
            current = current.next;
            carry = sum / 10;
        }
        return origin.next;
    }
}
