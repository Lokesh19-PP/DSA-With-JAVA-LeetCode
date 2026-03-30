class Solution {
    public int find(int[] freq){
        int maxc = -1;
        for(int i=0;i<256;i++){
            maxc = Math.max(maxc, freq[i]);
        }
        return maxc;
    }
    public int characterReplacement(String s, int k) {
        int[] f = new int[256];
        int left = 0;
        int res = 0;
        for(int right=0;right<s.length();right++){
            f[s.charAt(right)]++;
            int maxcnt = find(f);
            int len = right - left + 1;
            int diff = len - maxcnt;
            while(diff > k){
                f[s.charAt(left)]--;
                left++;
                maxcnt = find(f);
                len = right - left + 1;
                diff = len - maxcnt;
            }
            res = Math.max(res,right-left+1);
        }
        return res;
    }
}