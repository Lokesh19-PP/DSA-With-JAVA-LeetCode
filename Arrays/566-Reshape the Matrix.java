class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int len = mat.length*mat[0].length;
        int len_n = r*c;
        if(len != len_n){
            return mat;
        }
        int[] arr = new int[r*c];
        int k = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                arr[k] = mat[i][j];
                k++;
            }
        }
        k=0;
        int[][] Arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                Arr[i][j] = arr[k];
                k++;
            }
        }
        return Arr;
    }
}