class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int high = matrix[0].length-1;
        int low = 0;
        int row = -1;
        for(int i=0;i<matrix.length;i++){
            if(target >= matrix[i][low] && target <= matrix[i][high]){
                row = i;
                break;
            }
        }
        if(row == -1) return false;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(matrix[row][mid] == target){ 
                return true;
            }
            else if(matrix[row][mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}