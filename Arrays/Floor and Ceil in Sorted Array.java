class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int[] ans = new int[2];
       int low = 0;
       int high = nums.length-1;
       Arrays.fill(ans,-1);
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(nums[mid] >= x){
                ans[1] = nums[mid];
                high = mid - 1;
            }
            else low = mid + 1;
        }
        low = 0;
        high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(nums[mid] <= x){
                ans[0] = nums[mid];
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return ans;
    }
}