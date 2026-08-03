class Solution {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        removeCH(s,0,c);
    }
    public static void removeCH(StringBuilder s,int i,char c){
        if(i >= s.length()) return;
        if(s.charAt(i) == c) {
            s.deleteCharAt(i);
            removeCH(s,i,c);
        }
        else{
            removeCH(s,i+1,c);
        }
    }
}