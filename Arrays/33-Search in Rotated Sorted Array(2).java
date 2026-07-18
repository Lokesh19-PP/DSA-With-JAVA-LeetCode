class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int index = 0;
        while(low < high) {
            int mid = low+(high - low)/2;
            if(nums[mid] > nums[high]) low = mid + 1;
            else high = mid;
        }
        int pivot = low;
        low = 0;
        high = nums.length-1;
        if(target >= nums[pivot] && target <= nums[high]){
            low = pivot;
        }
        else{
            high = pivot-1;
        }
        while(low <= high){
            int m = low+(high - low)/2;
            if(nums[m] == target) return m;
            else if(nums[m] > target) high = m-1;
            else low = m + 1;
        }
        return -1;
    }

}