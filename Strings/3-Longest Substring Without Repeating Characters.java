class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        int left = 0;
        int len = 0;
        for(int right = 0;right < s.length();right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0)+1);
            while(freq.get(s.charAt(right)) > 1){
                freq.put(s.charAt(left),freq.get(s.charAt(left))-1);
                left++;
            }
            len = Math.max(len,right-left+1);
        }
        return len;
    }
}