class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || k == 0) {
            return head;
        }
        
        ListNode node = head;
        int length = 1;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        
        node.next = head;
        
        k %= length;
        
        ListNode newTail = new ListNode(0, head);
        ListNode newHead;
        while (length - k > 0) {
            newTail = newTail.next;
            k++;
        }
        newHead = newTail.next;
        newTail.next = null;
        
        
        return newHead;
        
    }
}
