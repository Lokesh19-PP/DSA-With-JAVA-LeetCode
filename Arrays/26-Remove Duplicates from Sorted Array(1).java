class Solution {
    public int removeDuplicates(int[] nums) {
        int off = 0;
        int cm = off+1;
        int unique = 1;
        while(cm < nums.length){
            if(nums[cm] == nums[cm-1]){
                cm++;
                continue;
            }
            nums[off+1] = nums[cm];
            unique++;
            cm++;
            off++;
        }
        return unique;
    }
}