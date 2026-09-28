class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int count = 1;
        char[] ch = word.toCharArray();
        for(int i=0;i<n-1;i++){
            if(ch[i] == ch[i+1]){
                count++;
            }
        }
        return count;
    }
}