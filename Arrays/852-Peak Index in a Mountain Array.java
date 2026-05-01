class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1;
        int high = arr.length-2;
        int res = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                res = mid;
                break;
            }
            else if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return res;
    }
}