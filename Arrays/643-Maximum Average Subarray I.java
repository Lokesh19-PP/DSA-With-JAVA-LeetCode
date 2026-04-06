class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum = sum + nums[i];
        }
        double res = sum;
        for(int high=k;high<nums.length;high++){
            sum = sum + nums[high];
            sum = sum - nums[low++];
            res = Math.max(res,sum);
        }
        return res/k;
    }
}