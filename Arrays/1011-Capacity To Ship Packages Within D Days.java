class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int low = Arrays.stream(nums).max().getAsInt();
        int high = 0;
        int ans = Integer.MAX_VALUE;
        for(int num : nums){
            high += num;
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            int day = calDays(nums,mid);
            if(day <= days){
                ans = Math.min(mid,ans);
                high = mid - 1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int calDays(int[] nums,int w){
        int days = 1;
        int sum = 0;
        for(int num : nums){
            if(sum+num > w){
                days++;
                sum = num;
            }
            else sum += num;
        }
        return days;
    }
}