class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)bloomDay.length < (long)m * k) return -1;
        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int countOfbouquets = daysCount(mid,bloomDay,k);
            if(countOfbouquets >= m){
                ans = mid;
                high = mid -1;
            }
            else low = mid + 1;
        }
        return ans;
    }
    public int daysCount(int day,int[] bloomDay,int k){
        int cnt = 0;
        int ans = 0;
        for(int i=0;i<bloomDay.length;i++){
            if(day >= bloomDay[i]) cnt++;
            else{
                ans += cnt/k;
                cnt = 0;
            }
        }
        ans += cnt/k;
        return ans;
    }
}