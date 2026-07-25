class Pair{
    int freq;
    String word;
    Pair(int f,String w){
        freq = f;
        word = w;
    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->
            {
                if(a.freq != b.freq) return b.freq-a.freq;
                return a.word.compareTo(b.word);
            }
        );
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String word = entry.getKey();
            int freq = entry.getValue();
            pq.offer(new Pair(freq,word));
        }
        for(int i=0;i<k;i++){
            Pair pair = pq.poll();
            ans.add(pair.word);
        }
        return ans;
    }
}