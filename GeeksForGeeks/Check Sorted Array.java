class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        return check(arr,0,1);
    }
    static boolean check(int[] arr,int one,int two){
        if(two == arr.length) return true;
        if(arr[one] <= arr[two]) return check(arr,one+1,two+1);
        return false;
    }
}