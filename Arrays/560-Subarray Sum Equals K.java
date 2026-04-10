class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int cnt = 0;
        map.put(0,1);
        for(int num : nums){
            sum += num;
            int prev = sum - k;
            if(map.containsKey(prev)) cnt += map.get(prev);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}