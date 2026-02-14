class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) { 
        if(obstacleGrid[0][0] == 1) return 0;
        int[][] arr = new int[obstacleGrid.length][obstacleGrid[0].length];
        arr[0][0] = 1;
        for(int i=1;i<obstacleGrid[0].length;i++){
            if(obstacleGrid[0][i] == 0){
                arr[0][i]=arr[0][i-1];
            }
            else{
                arr[0][i] = 0;
            } 
        }
        for(int i=1;i<obstacleGrid.length;i++){
            if(obstacleGrid[i][0] == 0){
                arr[i][0]=arr[i-1][0];
            }
            else{
                arr[i][0] = 0;
            } 
        }
        for(int i=1;i<obstacleGrid.length;i++){
            for(int j=1;j<obstacleGrid[0].length;j++){
                if(obstacleGrid[i][j] == 1){
                    arr[i][j] = 0;
                }
                else{
                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
                }
            }
        }
        return arr[obstacleGrid.length-1][arr[0].length-1];
    }
}