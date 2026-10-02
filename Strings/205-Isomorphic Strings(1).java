class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] S = new int[256];
        int[] T = new int[256];
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(S[ch1] != T[ch2]) return false;
            S[ch1] = i+1;
            T[ch2] = i+1;
        }
        return true;
    }
}