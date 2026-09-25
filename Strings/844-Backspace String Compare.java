class Solution {
    public boolean backspaceCompare(String s, String t) { 
        StringBuilder S = new StringBuilder();
        StringBuilder T = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '#') S.append(ch);
            else if(S.length() > 0) S.deleteCharAt(S.length()-1);
        }
        for(char ch : t.toCharArray()){
            if(ch != '#') T.append(ch);
            else if(T.length() > 0) T.deleteCharAt(T.length()-1);
        }
        return S.toString().equals(T.toString());
    }
}