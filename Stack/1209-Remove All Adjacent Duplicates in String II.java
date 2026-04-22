class Solution {
    public class pair{
        char ch;
        int cnt;
        pair(char ch,int cnt){
            this.ch = ch;
            this.cnt = cnt;
        }
    }
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<pair> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if (stack.isEmpty() || stack.peek().ch != s.charAt(i)){
                stack.push(new pair(s.charAt(i),1));
            }
            else{
                stack.peek().cnt++;
            }
            if(stack.peek().cnt == k){
                stack.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            pair p = stack.pop();
            for(int i=0;i<p.cnt;i++){
                ans.append(p.ch);
            }
        }
        return ans.reverse().toString();
    }
}