class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> res = new ArrayList<>();
        int i=0,j=0;
        while(i < firstList.length && j < secondList.length){
            int st1 = firstList[i][0];
            int en1 = firstList[i][1];
            int st2 = secondList[j][0];
            int en2 = secondList[j][1];
            if(st1 <= st2){
                if(en1 >= st2){
                    res.add(new int[]{Math.max(st1,st2),Math.min(en1,en2)});
                }
            }
            else{
                if(en2 >= st1){
                    res.add(new int[]{Math.max(st1,st2),Math.min(en1,en2)});
                }
            }
            if(en1 <= en2) i++;
            else j++;
        }
        return res.toArray(new int[res.size()][]);
    }
}