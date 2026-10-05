class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int i = 0;
        int j = ans.length-1;
        while(i < j){
            while(i < j && !isVowel(ans[i])) i++;
            while (i < j && !isVowel(ans[j])) j--; 
            if(isVowel(ans[i]) && isVowel(ans[j])){
                char temp = ans[i];
                ans[i] = ans[j];
                ans[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ans);
    }
    private boolean isVowel(char c){
        char ch = Character.toLowerCase(c);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}