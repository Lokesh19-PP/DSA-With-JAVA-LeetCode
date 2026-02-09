class Solution {
    int i=0;
    int count=0;
    public int arrangeCoins(int n) {
        i++;
        if(n >= i){
            count++;
            arrangeCoins(n-i);
        }
        return count;
    }
}