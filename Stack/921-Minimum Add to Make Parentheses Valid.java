class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> sta = new Stack<>();
        for(char ch : s.toCharArray()){
            if(sta.isEmpty()) sta.push(ch);
            else{
                if(sta.peek() == '(' && ch == ')') sta.pop();
                else sta.push(ch);
            }
        }
        return sta.size();
    }
}