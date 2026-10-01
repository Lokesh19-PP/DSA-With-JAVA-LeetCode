class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length()) return ans;
        int[] S = new int[26];
        int[] P = new int[26];
        for(int i=0;i<p.length();i++){
            P[p.charAt(i) - 'a']++;
            S[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(P,S)) ans.add(0);
        for(int i=1;i<=s.length()-p.length();i++){
            S[s.charAt(i-1) - 'a']--;
            S[s.charAt(i+p.length()-1) - 'a']++;
            if(Arrays.equals(P,S)) ans.add(i);
        }
        return ans;
    }
}