class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 0) return x;
        int low = 1;
        int high = x / 2;
        int res = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long sqr = (long) mid * mid;
            if(sqr > x){
                high = mid - 1;
            }
            else if(sqr == x){
                return mid;
            }
            else{
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}