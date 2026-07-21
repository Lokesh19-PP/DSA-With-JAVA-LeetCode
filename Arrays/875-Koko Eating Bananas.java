class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int res = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            long hour = speed(piles,mid);
            if(hour > h){
                low = mid+1;
            }
            else{
                high = mid-1;
                res = mid;
            }
        }
        return res;
    }

    long speed(int[] p,int k){
        long h = 0;
        for(int i=0;i<p.length;i++){
            h += p[i]/k;
            if(p[i]%k != 0) h++;
        }
        return h;
    }
}