class Solution {
    public boolean find(int[] tArr, int[] sArr){
        for(int i =0;i<256;i++){
            if(tArr[i] > sArr[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return "";
        int[] tArr = new int[256];
        int[] sArr = new int[256];
        int left = 0,start = 0,end = 0,res = Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            tArr[t.charAt(i)]++;
        }
        for(int right=0;right<s.length();right++){
            sArr[s.charAt(right)]++;
            while(find(tArr,sArr)){
                int len = right-left+1;
                if(len < res){
                    res = len;
                    start = left;
                }
                sArr[s.charAt(left)]--;
                left++;
            }
        }
        return res == Integer.MAX_VALUE?"":s.substring(start,start+res);
    }
}