class Pair{
    int freq;
    int row;
    Pair(int f,int r){
        freq = f;
        row = r;
    }
}

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.freq != b.freq) return Integer.compare(a.freq,b.freq);
                return Integer.compare(a.row,b.row);
            }
        );
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            pq.offer(new Pair(count(mat[i]) , i));
        }
        int[] ans = new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i] = pq.poll().row;
        }
        return ans;
    }
    public int count(int[] arr){
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) break;
            c++;
        }
        return c;
    }
}