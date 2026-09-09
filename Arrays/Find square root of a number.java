class Solution {
    public int floorSqrt(int n) {
      if (n == 0) return 0;
      int low = 1;
      int high = n;
      int ans = 1;
      while(low <= high){
        int mid = low+(high-low)/2;
        long sq = (long) mid * mid;
        if(sq == n) return mid;
        else if (sq < n){
            ans = mid;
            low = mid + 1;
        }
        else high = mid - 1;
      }
      return ans;
    }
}
