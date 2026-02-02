class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> cur=new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                int val=triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                cur.set(j,val);
            }
            triangle.add(cur);
        }
        return triangle;
    }
}