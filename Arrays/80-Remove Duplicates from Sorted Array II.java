class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int j =1;
        for(int i=1; i<len;i++){
            if(j == 1 || nums[i] != nums[j-2]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}