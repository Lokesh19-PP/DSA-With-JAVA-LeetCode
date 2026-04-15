class Solution {
    public static int[] rev(int st,int en, int[] arr){
        while(st < en){
            int temp = arr[st];
            arr[st] = arr[en];
            arr[en] = temp;
            st++;
            en--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        rev(0,n-1,nums);
        rev(0,k-1,nums);
        rev(k,n-1,nums);
    }
}