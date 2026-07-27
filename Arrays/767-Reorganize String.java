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
        Pair prev = null;
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            if(prev != null && prev.freq > 0){
                pq.offer(prev);
            }
            ans.append(pair.value);
            pair.freq--;
            prev = pair;
        } 
        return ans.length() == s.length() ? ans.toString() :  "";
        }
}