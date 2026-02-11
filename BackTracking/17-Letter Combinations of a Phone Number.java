class Solution {
    private void solve(int i,String digits,String s,List<String> list,HashMap<Character, String> map){
        if(digits.length() == i){
            list.add(s);
            return;
        }
        for(char c : map.get(digits.charAt(i)).toCharArray()){
            String temp = new String(s);
            temp += c;
            solve(i+1,digits,temp,list,map);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if(digits.length()==0) return list;
        solve(0,digits,"",list,map);
        return list;
    }
}