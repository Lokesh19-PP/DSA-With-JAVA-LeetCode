class Solution {
    public static int mergesort(int[] arr,int low,int high){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = low + (high - low) / 2;
        cnt += mergesort(arr,low,mid);
        cnt += mergesort(arr,mid+1,high);
        cnt += cntpair(arr,low,mid,high);
        mergepair(arr,low,mid,high);
        return cnt;
    }
    public static int cntpair(int[] arr,int low,int mid,int high){
        int right = mid+1;
        int cnt = 0;
        for(int i=low;i<=mid;i++){
            while(right <= high && (long)arr[i] > 2L*arr[right]) right++;
            cnt += (right - (mid+1));
        }
        return cnt;
    }
    public static void mergepair(int[] arr,int low,int mid,int high){
        int[] temp = new int[high - low +1];
        int left = low;
        int right = mid+1;
        int k = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]) temp[k++] = arr[left++];
            else temp[k++] = arr[right++];
        }
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }
        for(int i=0;i<temp.length;i++){
            arr[low + i] = temp[i];
        }
    }
    public int reversePairs(int[] arr) {
        return mergesort(arr,0,arr.length-1);
    }
}