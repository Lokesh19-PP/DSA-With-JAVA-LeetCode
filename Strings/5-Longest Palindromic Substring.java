class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            int st=i,en=i;
            while(st>=0 && en<s.length() && s.charAt(st) == s.charAt(en)){
                st--;
                en++;
            }
            String temp = s.substring(st+1,en);
            if(temp.length() > res.length()) res = temp;

            st=i;
            en=i+1;
             while(st>=0 && en<s.length() && s.charAt(st) == s.charAt(en)){
                st--;
                en++;
            }
            temp = s.substring(st+1,en);
            if(temp.length() > res.length()) res = temp;
        }
        return res;
    }
}