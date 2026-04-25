class Solution {
    public boolean result(HashMap<Character,Integer> ran, HashMap<Character,Integer> mag){
        for(Map.Entry<Character,Integer> entry : ran.entrySet()){
            if(mag.getOrDefault(entry.getKey(),0) < entry.getValue()){
                return false;
            }
        }
        return true;
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ran = new HashMap<>();
        HashMap<Character,Integer> mag = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            ran.put(ransomNote.charAt(i),ran.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            mag.put(magazine.charAt(i),mag.getOrDefault(magazine.charAt(i),0)+1);
        }
        return result(ran,mag);
   }
}