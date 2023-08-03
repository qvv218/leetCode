package target;

public class AddTwoNumbers {
    

    public ListNode solution(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        ListNode result = listNode;
        int remainder = 0;

        while (l1 != null || l2 != null) {
            int val = 0;

            if (l1 != null) {
                val = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val = val + l2.val;
                l2 = l2.next;
            }
            listNode.val = (val + remainder) % 10;
            remainder = (val + remainder) / 10;

            if (l1 != null || l2 != null) {
                listNode.next = new ListNode();
                listNode = listNode.next;
            } else if (remainder != 0) {
                listNode.next = new ListNode(1);
            }
        }

        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}