class Pair{
    int freq;
    char value;
    Pair(int f, char s){
        freq = f;
        value = s;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a.freq != b.freq) return b.freq-a.freq;
                return Character.compare(b.value,a.value);
            }
        );
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char ch = entry.getKey();
            int f = entry.getValue();
            pq.offer(new Pair(f,ch));
        } 
        StringBuilder ans = new StringBuilder();
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            if(ans.isEmpty() || ans.charAt(ans.length()-1) != pair.value){
                ans.append(pair.value);
                pair.freq--;
                if(pair.freq > 0) pq.offer(pair);
            }
            else{
                if(pq.isEmpty()) return "";
                Pair p = pq.poll();
                ans.append(p.value);
                p.freq--;
                if(p.freq > 0) pq.offer(p);
                pq.offer(pair);
            }
        } 
        return ans.toString();  
        }
}