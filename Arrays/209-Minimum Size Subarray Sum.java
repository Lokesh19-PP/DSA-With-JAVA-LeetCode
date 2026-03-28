class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;
        while(high < nums.length){
            sum += nums[high++];
            while(sum >= target){
                result = Math.min(result , high-low);
                sum -= nums[low];
                low++;
            }
        }
        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}