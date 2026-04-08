class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int minvalue = nums[0];
        int maxvalue = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max + nums[i],nums[i]);
            min = Math.min(min + nums[i],nums[i]);
            maxvalue = Math.max(maxvalue,max);
            minvalue = Math.min(minvalue,min);
            sum += nums[i];
        }
        if (maxvalue < 0) {
            return maxvalue;
        }
        return Math.max(sum-minvalue,maxvalue);
    }
}