class Pair{
    int dis;
    int idx;
    Pair(int dis, int idx){
        this.dis = dis;
        this.idx = idx;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) ->
        {
            if(a.dis != b.dis) return b.dis-a.dis;
            return b.idx-a.idx;
        });
        for(int i=0;i<points.length;i++){
            int dis = distance(points[i]);
            Pair pair = new Pair(dis,i);
            if(pq.size() < k){
                pq.offer(pair);
            }
            else if(dis < pq.peek().dis){
                pq.poll();
                pq.offer(pair);
            }
        }
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            Pair pair = pq.poll();
            ans[i] = points[pair.idx];
        }
        return ans;
    }

    public int distance(int[] pair){
        return pair[0]*pair[0] + pair[1]*pair[1];
    }
}