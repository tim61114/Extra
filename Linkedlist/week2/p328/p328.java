class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode evenHead = head.next;
        ListNode dummy2 = new ListNode(0, evenHead);
        while (head != null && evenHead != null) {
            head.next = evenHead.next;
            head = head.next;
            if (head != null) {
                evenHead.next = head.next;
                evenHead = evenHead.next;
            }
        }
        
        ListNode curr = dummy.next;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = dummy2.next;
        return dummy.next;
    }
}
