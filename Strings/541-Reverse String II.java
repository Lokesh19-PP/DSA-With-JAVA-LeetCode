class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = s.length();
        for(int i=0;i<n;i+=2*k){
            int left = i;
            int right = Math.min(i+k-1, n-1);
            while(left < right){
                char tem = ch[left];
                ch[left] = ch[right];
                ch[right] = tem;
                left++;
                right--;
            }
        }
        return new String(ch);
    }
}