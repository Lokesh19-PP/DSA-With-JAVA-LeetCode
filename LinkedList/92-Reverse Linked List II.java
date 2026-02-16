class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=1;i<left;i++){
            prev = prev.next;
        }
        ListNode cur = prev.next;
        ListNode nextNode = null;
        ListNode reverse = null;
        for(int i=0;i < right-left+1;i++){
            nextNode = cur.next;
            cur.next = reverse;
            reverse = cur;
            cur = nextNode;
        }
        prev.next.next = cur;
        prev.next = reverse;
        return dummy.next;
    }
}