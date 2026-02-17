class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            List<Integer> list = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                int val=triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j);
                list.set(j,val);
            }
            triangle.add(list);
            temp = list;
       } 
       return temp;
    }
}