class Solution {
    public List<Integer> grayCode(int n) {
        int len = 1 << n;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<len;i++){
            list.add(i ^ (i >> 1));
        }
        return list;
    }
}