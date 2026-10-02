class Solution {
    public String[] findWords(String[] words) {
        String[] key = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        int[] chRow = new int[26];
        for(int i=0;i<key.length;i++){
            for(char s : key[i].toCharArray()){
                chRow[s-'a'] = i+1;
            }
        }
        List<String> ans = new ArrayList<>();
        boolean isValid = true;
        for(int i=0;i<words.length;i++){
            int row = chRow[Character.toLowerCase(words[i].charAt(0)) - 'a'];
            for(char s : words[i].toCharArray()){
                if(chRow[Character.toLowerCase(s) - 'a'] != row) isValid = false;
            }
            if(isValid == true) ans.add(words[i]);
            isValid = true;
        }
        return ans.toArray(new String[0]);
    }
}