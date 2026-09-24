class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i == cal(nums[i])) return i;
        }
        return -1;
    }
    public int cal(int no){
        int sum = 0;
        while(no != 0){
            sum += no % 10;
            no /= 10;
        }
        return sum;
    }
}