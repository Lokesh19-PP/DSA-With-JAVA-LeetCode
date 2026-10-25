class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        for(int[] row : grid){
            map.put(Arrays.toString(row),map.getOrDefault(Arrays.toString(row),0)+1);
        }
        for(int i=0;i<grid.length;i++){
            int[] col = new int[grid.length];
            for(int j=0;j<grid.length;j++){
                col[j] = grid[j][i];
            }
            count += map.getOrDefault(Arrays.toString(col),0);
        }
        return count;
    }
}