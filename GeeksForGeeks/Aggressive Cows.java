class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1]-arr[0];
        int res = Integer.MIN_VALUE;
        while(low <= high){
            int mid = low+ (high-low)/2;
            boolean op = minDis(arr,mid,k);
            if(op == false){
                high = mid-1;
            }
            else{
                low = mid+1;
                res = Math.max(res,mid);
            }
        }
        return res;
    }
    
    boolean minDis(int[] arr, int  mid, int k){
        int cows = 1;
        int prevpos = arr[0];
        for(int i=1;i<arr.length;i++){
            int dis = arr[i] - prevpos;
            if(dis < mid) continue;
            cows++;
            prevpos = arr[i];
        }
        if(cows >= k) return true;
        else return false;
    }
}
