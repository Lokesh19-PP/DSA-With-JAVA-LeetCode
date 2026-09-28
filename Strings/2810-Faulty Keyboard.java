class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == 'i'){
                reverseString(ans);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void reverseString(StringBuilder ans){
        int j = ans.length()-1;
        int i = 0;
        while(i < j){
            char temp = ans.charAt(i);
            ans.setCharAt(i,ans.charAt(j));
            ans.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
