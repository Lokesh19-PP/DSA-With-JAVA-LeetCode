class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '*') st.push(ch);
            else{
                st.pop();
            }
        }
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}