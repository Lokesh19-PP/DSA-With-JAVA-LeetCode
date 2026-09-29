class Solution {
    public String reverseByType(String s) {
        StringBuilder st = new StringBuilder();
        StringBuilder sp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)) st.append(ch);
            else sp.append(ch);
        }
        int n = st.length()-1;
        int m = sp.length()-1;
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                ans.append(st.charAt(n--));
            }
            else ans.append(sp.charAt(m--));
        }
        return ans.toString();
    }
}