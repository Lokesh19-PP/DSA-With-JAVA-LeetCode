class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2;i>=0;i--){
            List<Integer> row = triangle.get(i);
            List<Integer> next = triangle.get(i+1);
            for(int j=0;j<row.size();j++){
                int small = Math.min(next.get(j), next.get(j+1));
                row.set(j, row.get(j)+small);
            }
        }
        return triangle.get(0).get(0);
    }
}