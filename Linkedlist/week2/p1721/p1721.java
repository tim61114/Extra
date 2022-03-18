class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode middle = dummy;
        ListNode slow = dummy;
        int count = 0;
        while (count < k) {
            fast = fast.next;
            slow = slow.next;
            count++;
        }
        while (fast != null) {
            fast = fast.next;
            middle = middle.next;
        }
        
        int temp = slow.val;
        slow.val = middle.val;
        middle.val = temp;
        
        return dummy.next;
    }
}
