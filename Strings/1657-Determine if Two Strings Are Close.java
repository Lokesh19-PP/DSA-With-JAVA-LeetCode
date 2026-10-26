class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        HashMap<Character,Integer> w1 = new HashMap<>();
        HashMap<Character,Integer> w2 = new HashMap<>();
        for(char ch : word1.toCharArray()) w1.put(ch,w1.getOrDefault(ch,0)+1);
        for(char ch : word2.toCharArray()) w2.put(ch,w2.getOrDefault(ch,0)+1);
        if(!w1.keySet().equals(w2.keySet())) return false;
        List<Integer> freq1 = new ArrayList<>(w1.values());
        List<Integer> freq2 = new ArrayList<>(w2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }
}