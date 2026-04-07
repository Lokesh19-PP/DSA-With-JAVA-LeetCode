class Solution {
    public int maximumSum(int[] arr) {
        int oneDelete = Integer.MIN_VALUE;
        int noDelete = arr[0];
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            int prev_noDelete = noDelete;
            int prev_oneDelete = oneDelete;
            noDelete = Math.max(noDelete+arr[i],arr[i]);
            int temp;
            if(prev_oneDelete == Integer.MIN_VALUE){
                temp = arr[i];
            }
            else{
                temp = prev_oneDelete + arr[i];
            }            
            oneDelete = Math.max(prev_noDelete,temp);
            res = Math.max(res,Math.max(noDelete,oneDelete));
        }
        return res;
    }
}