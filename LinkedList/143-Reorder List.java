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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode left = head;
        ListNode right = head;
        while(right.next != null && right.next.next != null){
            left = left.next;
            right = right.next.next;
        }
        ListNode prev = null;
        ListNode curr = left.next;
        left.next = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null){
            ListNode a = first.next;
            ListNode b = second.next;
            first.next = second;
            second.next = a;
            first = a;
            second = b;
        }
    }
}