class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ans = new ArrayList<>();
        int st1 = intervals[0][0];
        int en1 = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int st2 = intervals[i][0];
            int en2 = intervals[i][1];
            if(en1 >= st2){
                en1 = Math.max(en1,en2);
                continue;
            }
            ans.add(new int[]{st1,en1});
            st1 = st2;
            en1 = en2;
        }
        ans.add(new int[]{st1,en1});
        return ans.toArray(new int[ans.size()][]);
    }
}