class Solution {
 public ListNode removeNthFromEnd(ListNode head, int n) {
        int k = countNodes(head);

        if (n == k) {
            return head.next;
        }

        ListNode current = head;
        for (int i = 1; i < k - n; i++) {
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }

    private int countNodes(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

