class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(char ch : jewels.toCharArray()){
            for(int i=0;i<stones.length();i++){
                if(ch == stones.charAt(i)) count++;
            }
        }
        return count;
    }
}