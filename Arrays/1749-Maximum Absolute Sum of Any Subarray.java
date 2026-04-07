class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = 0;
        int max = 0;
        int minValue = 0;
        int maxValue = 0;
        for(int i=0;i<nums.length;i++){
            min = Math.min(min + nums[i],nums[i]);
            minValue = Math.min(min,minValue);
            max = Math.max(max + nums[i],nums[i]);
            maxValue = Math.max(max,maxValue);
        } 
        return Math.max(Math.abs(minValue),maxValue);  
    }
}