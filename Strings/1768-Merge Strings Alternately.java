class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder ans = new StringBuilder();
        int minlen = Math.min(n,m);
        for(int i=0;i<minlen;i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        if(n > m) ans.append(word1.substring(minlen));
        else ans.append(word2.substring(minlen));
        return ans.toString();
    }
}