class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int curr = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
            curr += i * nums[i];
        }
        int max = curr;
        for(int i=1;i<n;i++){
            curr = curr + sum - n * nums[n-i];
            if(curr > max){
                max = curr;
            }
        }
        return max;
    }
}