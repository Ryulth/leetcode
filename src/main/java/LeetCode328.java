public class LeetCode328 {

    public static void main(String[] strings) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        ListNode curr = oddEvenList(listNode);
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode oddCurrentNode = head;
        ListNode evenHeadNode = head.next;
        ListNode evenCurrentNode = evenHeadNode;
        while (evenCurrentNode != null && evenCurrentNode.next != null) {
            oddCurrentNode.next = evenCurrentNode.next;
            oddCurrentNode = oddCurrentNode.next;
            evenCurrentNode.next = oddCurrentNode.next;
            evenCurrentNode = evenCurrentNode.next;
        }
        oddCurrentNode.next = evenHeadNode;
        return head;
    }
}
