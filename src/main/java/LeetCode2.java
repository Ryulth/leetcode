import java.util.Optional;

public class LeetCode2 {
    public static void main(String[] strings) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode res = dummy;
        int carry = 0;
        while (current1 != null || current2 != null) {
            int val1 = 0;
            int val2 = 0;
            if (current1 != null) {
                val1 = current1.val;
            }
            if (current2 != null) {
                val2 = current2.val;
            }
            int sum = val1 + val2 + carry;

            res.next = new ListNode(sum%10);
            res = res.next;
            carry = sum/10;

            if (current1 != null) {
                current1 = current1.next;
            }
            if (current2 != null) {
                current2 = current2.next;
            }
        }
        if (carry > 0) {
            res.next = new ListNode(1);
        }
        return dummy.next;
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
