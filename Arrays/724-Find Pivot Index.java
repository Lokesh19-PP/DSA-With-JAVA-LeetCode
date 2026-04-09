class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];
        prefixSum[0] = 0;
        suffixSum[nums.length-1] = 0;
        for(int i=1;i<nums.length;i++) prefixSum[i] = prefixSum[i-1] + nums[i-1];
        for(int i=nums.length-2;i>=0;i--) suffixSum[i] = suffixSum[i+1] + nums[i+1];
        for(int i=0;i<nums.length;i++){
            if(prefixSum[i] == suffixSum[i]) return i;
        }
        return -1;
    }
}