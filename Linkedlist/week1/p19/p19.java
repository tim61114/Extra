class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode fast = head;
        ListNode dummy = new ListNode(0, head);
        ListNode slow = dummy;
        
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        
        
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}
