class Solution {
    public int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int val1 = 1;
        int val2 = 1;
        for(int i=0;i<nums.length;i++){
            if(val1 == 0){
                val1 = 1;
            }
            val1 *= nums[i];
            max1 = Math.max(max1,val1);
        }
        for(int i=nums.length-1;i>=0;i--){
            if(val2 == 0){
                val2 = 1;
            }
            val2 *= nums[i];
            max2 = Math.max(max2,val2);
        }
        return Math.max(max1,max2);
    }
}