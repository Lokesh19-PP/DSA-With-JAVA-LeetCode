class Solution {
    public int majorityElement(int[] nums) {
        int val=0;
        int count=0;
        for(int n:nums){
            if(count==0){
                val=n;
            }
            if(val==n){
                count++;
            }
            else{
                count--;
            }
        }
        return val;
    }
}