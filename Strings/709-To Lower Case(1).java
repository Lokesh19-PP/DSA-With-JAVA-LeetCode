class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)) ans.append(Character.toLowerCase(ch));
            else ans.append(ch);
        }
        return ans.toString();
    }
}