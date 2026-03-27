/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        tail.next = head;
        k %= len;
        int count = len-k-1;
        ListNode newTail = head;
        for (int i = 0; i < count; i++) {
            newTail = newTail.next;
        }
        ListNode main = newTail.next;
        newTail.next = null;
        return main;
    }
}