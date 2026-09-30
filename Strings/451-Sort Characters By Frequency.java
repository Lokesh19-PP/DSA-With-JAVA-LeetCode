class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b.freq,a.freq)
        );
        for(Map.Entry<Character,Integer> en : map.entrySet()){
            pq.offer(new Pair(en.getValue(),en.getKey()));
        }
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            attach(pair,ans);
        }
        return ans.toString();
    }
    public static void attach(Pair pair,StringBuilder ans){
        for(int i=0;i<pair.freq;i++){
            ans.append(pair.ch);
        }
    }
}
class Pair{
    char ch;
    int freq;
    Pair(int f,char c){
        ch = c;
        freq = f;
    }
}