class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if (arr.length <= 1) return arr.length;
        int cnt1 = 0;
        int maxlen = 0;
        int cnt2 = 0;
        for(int i=0;i<arr.length-1;i++){
            if (i % 2 == 0) {
                if (arr[i] > arr[i + 1]) cnt1++;
                else cnt1 = 0;
            } else {
                if (arr[i] < arr[i + 1]) cnt1++;
                else cnt1 = 0;
            }
            if (i % 2 == 0) {
                if (arr[i] < arr[i + 1]) cnt2++;
                else cnt2 = 0;
            } else {
                if (arr[i] > arr[i + 1]) cnt2++;
                else cnt2 = 0;
            }
            maxlen = Math.max(maxlen ,Math.max(cnt1,cnt2));
        }
        return maxlen+1;
    }
}