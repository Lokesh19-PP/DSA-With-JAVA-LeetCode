import java.io.*;
class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder S=new StringBuilder();
        S.append(s);
        S.reverse();
        int size=0;
        int index=0;
        for(int k=0;k<S.length();k++){
            if(S.charAt(k) != ' '){
                   break;
            }
            index=k+1;
        }
        for(int i=index;i<S.length();i++){
            if(S.charAt(i) == ' '){
                break;
            }
            size++;
        }
        return size;
    }
}