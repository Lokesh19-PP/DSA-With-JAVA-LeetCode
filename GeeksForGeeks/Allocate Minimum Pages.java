class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length < k) return -1;
        long low = Arrays.stream(arr).max().getAsInt();
        long high = 0;
        for(int i=0;i<arr.length;i++){
            high += arr[i];
        }
        long res = high;
        while(low <= high){
            long mid = low + (high-low)/2;
            if(maxVal(arr,k,mid)){
                res = Math.min(res,mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return (int)res;
    }
    
    boolean maxVal(int[] arr ,int stud ,long mid){
        int k = 1;
        long page = 0;
        for(int i=0;i<arr.length;i++){
            if((page + arr[i]) <= mid){
                page += arr[i];
            }
            else{
                k++;
                page = arr[i];
                if(k > stud){
                    return false;
                }
            }
        }
        return true;
    }
}