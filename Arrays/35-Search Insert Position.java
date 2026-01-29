class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
       for(int i=0;nums[i]!=target && i<=nums.length-1;i++){
            if(nums[i]>target){
                break;
            }
            else if(i==nums.length-1){
                index=i+1;
                break;
            }
            index++;
       }
       return index;
    }
}