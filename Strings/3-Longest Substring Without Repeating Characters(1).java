class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        int left = 0;
        int len = 0;
        int k = 0;
        for(int right = 0;right < s.length();right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0)+1);
            k = right - left + 1;
            while(freq.size() < k){
                freq.put(s.charAt(left),freq.get(s.charAt(left))-1);
                if(freq.get(s.charAt(left)) == 0) freq.remove(s.charAt(left));
                left++;
                k = right - left + 1;
            }
            len = Math.max(len,right-left+1);
        }
        return len;
    }
}