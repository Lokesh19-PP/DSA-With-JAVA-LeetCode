class Solution {
    boolean isPalindrome(String s) {
        // code here
        return check(s,0,s.length()-1);
    }
    boolean check(String s,int start, int end){
        if(start >= end) return true;
        if(s.charAt(start) == s.charAt(end)) return check(s,start+1,end-1);
        return false;
    }
}