class Solution {
    public String capitalizeTitle(String title) {
        String ans = "";
        StringBuilder word = new StringBuilder();
        for(char ch : title.toCharArray()){
            if(ch == ' '){
                ans += capitalizeWord(word);
                ans += ' ';
                word.setLength(0);
            }
            else{
                word.append(ch);
            }
        }
        ans += capitalizeWord(word);
        return ans;
    }
    public String capitalizeWord(StringBuilder word){
        if(word.length() <= 2) return word.toString().toLowerCase();
        else{
            word.setCharAt(0,Character.toUpperCase(word.charAt(0)));
            for(int i=1;i<word.length();i++){
              word.setCharAt(i,Character.toLowerCase(word.charAt(i)));  
            }
        }
        return word.toString();
    }
}