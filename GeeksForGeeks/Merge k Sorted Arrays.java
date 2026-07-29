class Pair{
    int value;
    int row;
    int col;
    Pair(int v,int r,int c){
        value = v;
        row = r;
        col = c;
    }
}
class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(
            (a,b)->{
                if(a.value != b.value) return Integer.compare(a.value,b.value);
                else if(a.row != b.row) return Integer.compare(a.row,b.row);
                return Integer.compare(a.col,b.col);
            }
        );
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            if(mat[i].length > 0){
                pq.offer(new Pair(mat[i][0],i,0));
            }
        }
        while(ans.size() != mat.length * mat[0].length){
            Pair pair = pq.poll();
            ans.add(pair.value);
            if(pair.col < mat[pair.row].length-1) pq.offer(new Pair(mat[pair.row][pair.col+1],pair.row,pair.col+1));
        }
        return ans;
    }
}