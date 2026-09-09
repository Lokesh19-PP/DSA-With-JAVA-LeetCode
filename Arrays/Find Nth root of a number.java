class Solution {
    public int NthRoot(int N, int M) {
        int low = 1;
        int high = M;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int midpower = cal(N,M,mid);
            if(midpower == 1) return mid;
            else if(midpower == 2) high = mid -1;
            else low = mid + 1;
        }
        return -1;
    }
    public int cal(int N,int M,int mid){
        long ans = 1;
        for(int i=0;i<N;i++){
            ans *= mid;
            if(ans > M) return 2;
        }
        if(ans == M) return 1;
        return 0;
    }
}
