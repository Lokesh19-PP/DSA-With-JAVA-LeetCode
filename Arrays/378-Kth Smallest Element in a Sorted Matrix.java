class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int high = matrix[matrix.length-1][matrix[0].length-1];
        int res = -1;
        while(low <= high){
            int mid = low +(high-low)/2;
            int count = smallElement(matrix,mid);
            if(count >= k){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
    
    int smallElement(int[][] matrix, int mid){
        int row = matrix.length-1;
        int col = 0;
        int count = 0;
        while(row >= 0 && col < matrix[0].length){
            int corn = matrix[row][col];
            if(corn <= mid){
                count += row+1;
                col++;
            }
            else{

                row--;
            }
        }
        return count; 
    }
}