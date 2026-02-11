public class Solution {
    private ListNode Intersection(ListNode head){
        ListNode first = head;
        ListNode second = head;
        while(second != null && second.next != null){
            first = first.next;
            second = second.next.next;
            if(first == second){
                return first;
            }
        }  
        return null;
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode inter = Intersection(head);
        if(inter == null) return null;
        ListNode start = head;
        while(start != inter){
            start = start.next;
            inter = inter.next;
        }
        return start;
    }
}