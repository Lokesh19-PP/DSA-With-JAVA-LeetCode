class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int sum = sumOfDivisor(mid,nums);
            if(sum <= threshold){
                ans = Math.min(ans,mid);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int sumOfDivisor(int mid,int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += (num + mid - 1) / mid;
        }
        return sum;
    }
}