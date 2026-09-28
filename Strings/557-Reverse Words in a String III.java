class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                temp.reverse();
                ans.append(temp);
                ans.append(' ');
                temp.setLength(0);
            }
            else{
                temp.append(ch);
            }
        }
        temp.reverse();
        ans.append(temp);
        return ans.toString();
    }
}