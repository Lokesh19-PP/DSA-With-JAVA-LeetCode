class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.peek() == s.charAt(i)){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        String res ="";
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return new StringBuilder(res).reverse().toString();
    }
}