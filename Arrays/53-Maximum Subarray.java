class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnd = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            int v1 = nums[i];
            int v2 = bestEnd + nums[i];  
            bestEnd = Math.max(v1,v2);
            res = Math.max(res,bestEnd);
        }
        return res;
    }
}