class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] word = s.split(" ");
        for(int i=0;i<pattern.length();i++){
            String tem = word[i];
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(tem)) return false;
            }
            else{
                if(map.containsValue(tem)) return false;
                map.put(ch,tem);
            }
        }
        return true;
    }
}