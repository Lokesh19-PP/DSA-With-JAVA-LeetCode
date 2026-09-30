class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)) return true;
        int n = s.length();
        while(n > 0){
            s = shift(s);
            if(s.equals(goal)) return true;
            n--;
        }
        return false;
    }
    public String shift(String s){
        return s.substring(1) + s.charAt(0);
    }
}