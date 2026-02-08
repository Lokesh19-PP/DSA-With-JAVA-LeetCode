class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int no : nums){
            set.add(no);
        }
        List<Integer> list = new ArrayList<>(set);
        if(list.size() < 3){
            return list.get(list.size()-1);   
        }
        return list.get(list.size()-3);
    }
}