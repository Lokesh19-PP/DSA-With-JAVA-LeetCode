class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> tex = new HashMap<>();
        HashMap<Character,Integer> bal = new HashMap<>();
        for(int i=0;i<text.length();i++){
            tex.put(text.charAt(i),tex.getOrDefault(text.charAt(i),0)+1);
        }
        int res = Integer.MAX_VALUE;;
        bal.put('b',1);
        bal.put('a',1);
        bal.put('l',2);
        bal.put('o',2);
        bal.put('n',1);
        for(Map.Entry<Character,Integer> entry : bal.entrySet()){
            res = Math.min(res,(tex.getOrDefault(entry.getKey(),0))/entry.getValue());
        }
        return res;
    }
}