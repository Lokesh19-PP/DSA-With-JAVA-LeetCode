class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1;
        int high = m*n;
        int res = high;
        while(low <= high){
            int mid = low +(high-low)/2;
            int count = smallElement(m, n, mid);
            if(count >= k){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    int smallElement(int m,int n, int mid){
        int count = 0;
        for(int i=1;i<=m;i++){
            count += Math.min(n, mid/i);
        }
        return count; 
    }
}