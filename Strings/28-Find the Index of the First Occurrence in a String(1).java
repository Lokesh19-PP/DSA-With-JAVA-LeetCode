class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        String sub = haystack.substring(0,needle.length());
        if(sub.equals(needle)) return 0;
        for(int i=1;i<haystack.length()-needle.length()+1;i++){
            sub = haystack.substring(i,i+needle.length());
            if(sub.equals(needle)) return i;
        }
        return -1;
    }
}