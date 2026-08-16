class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int maxi = 1;
        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                maxi = Math.max(maxi,cnt);
            }
        }
        return maxi;
    }
}