class Pair{
    int first;
    int second;
    Pair(int f,int s){
        first = f;
        second = s;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->{
                if(a.first != b.first){
                    return b.first-a.first;
                }
                return b.second-a.second;
            }
        );
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            pq.offer(new Pair(value,key));
        }
        for(int i=0;i<k;i++){
            Pair pair = pq.poll();
            ans[i] = pair.second;
        }
        return ans;
    }
}