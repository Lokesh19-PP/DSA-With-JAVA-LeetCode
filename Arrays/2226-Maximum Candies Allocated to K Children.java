class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1;
        int high = Arrays.stream(candies).max().getAsInt();
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(calCandy(candies,k,mid)){
                ans = mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }

    public boolean calCandy(int[] candy,long k,int n){
        for(int num : candy){
            k -= num / n;
        }
        if(k <= 0) return true;
        return false;
    }
}