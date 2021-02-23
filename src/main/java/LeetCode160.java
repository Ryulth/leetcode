public class LeetCode160 {
    public static void main(String[] strings) {

    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
        ListNode nodeB = headB;

        int diff = nodeLength(headA) - nodeLength(headB);

        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                nodeA = nodeA.next;
            }
        }else if (diff < 0) {
            for (int i = 0; i < -(diff); i++) {
                nodeB = nodeB.next;
            }
        }

        while (nodeA != null && nodeB != null) {
            if (nodeA == nodeB) {
                return nodeA;
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }
    public static int nodeLength(ListNode node) {
        int count =0;
        ListNode curr = node;
        while (curr != null) {
            count ++;
            curr = curr.next;
        }
        return count;
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
