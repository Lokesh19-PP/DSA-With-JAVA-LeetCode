class Solution {
    private void putZero(int[][] matrix,Set<Integer> row,Set<Integer> col){

        for(int no : row){
            for(int i=0;i<matrix[0].length;i++){
                matrix[no][i] = 0;
            }
        }
        for(int no : col){
            for(int i=0;i<matrix.length;i++){
                matrix[i][no] = 0;
            }
        }
        
    }
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        putZero(matrix,row,col);
    }
}