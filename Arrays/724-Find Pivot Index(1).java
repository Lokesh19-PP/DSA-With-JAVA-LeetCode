class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int n : nums) sum += n;
        int prefixSum = 0;
        for(int i=0;i<nums.length;i++){
             if(prefixSum == (sum - prefixSum - nums[i])){
                return i;
             }
             prefixSum += nums[i];
        }
        return -1;
    }
}