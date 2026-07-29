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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b) ->{ return Integer.compare(a.val,b.val);
            }
        );
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for(int i=0;i<lists.length;i++){
            if(lists[i] != null){
                pq.offer(lists[i]);
            }
        }
        while(!pq.isEmpty()){
            ListNode pair = pq.poll();
            tail.next = pair;
            tail = tail.next;
            if(pair.next != null) pq.offer(pair.next);
        }
        return dummy.next;
    }
}