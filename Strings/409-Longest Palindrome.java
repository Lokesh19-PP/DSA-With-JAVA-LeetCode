class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> str = new HashMap<>();
        int res = 0;
        for(int i=0;i<s.length();i++){
            str.put(s.charAt(i),str.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : str.entrySet()){
            if((entry.getValue() % 2) == 0){
                res += entry.getValue();
            }
            else{
                if(entry.getValue() > 1){
                    res += entry.getValue()-1;
                }
            }
        }
        if((res % 2) == 0 && res < s.length()) res++;
        return res;
    }
}