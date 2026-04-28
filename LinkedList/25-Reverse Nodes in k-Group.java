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
    public void reverse(ListNode head,int k){
        ListNode curr = head;
        ListNode prev = null;
        while(k-- != 0){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return head;
        ListNode left = head;
        ListNode prevleft = null;
        ListNode res = null;
        ListNode right;
        while(left != null){
            right = left;
            for(int i=0;i<k-1;i++){
                if(right.next == null){
                    if(prevleft != null) prevleft.next = left;
                    return (res == null) ? head : res;
                }  
                right = right.next;   
            }
            ListNode nextleft = right.next;
            reverse(left,k);
            if (res == null) res = right;
            if (prevleft != null) prevleft.next = right;
            prevleft = left;
            left = nextleft;
        }
        return res;
    }
}