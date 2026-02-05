class Solution {
    public boolean isPowerOfTwo(int n) {
        int x=0;
        while(true){
            if(n == Math.pow(2,x)){
                return true;
            }
            if(n<Math.pow(2,x)){
                return false;
            }
            x++;
        }
        
    }
}