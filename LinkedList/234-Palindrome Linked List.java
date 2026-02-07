class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> S = new Stack();
        ListNode temp = head;
        while(temp != null){
            S.push(temp.val);
            temp=temp.next;
        }
        temp = head;
        while (temp != null && temp.val == S.pop()){
            temp = temp.next;
        }
        return temp == null;
    }
}