class Solution {

    ListNode reverse(ListNode head, int times) {
        ListNode curr = head;
        ListNode prev = null;

        while (times > 0 && curr != null) {
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
            times--;
        }

        return prev;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode right;
        ListNode prevleft = null;
        ListNode res = null;
        int size = 2;

        while (left != null && left.next != null) {
            right = left;

            for (int i = 0; i < size - 1; i++) {
                right = right.next;
            }

            ListNode nextleft = right.next;

            ListNode newHead = reverse(left, size);

            if (prevleft == null) {
                res = newHead;
            } else {
                prevleft.next = newHead;
            }

            left.next = nextleft;
            prevleft = left;
            left = nextleft;
        }

        return res;
    }
}
