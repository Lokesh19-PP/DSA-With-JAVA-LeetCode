class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> ht = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (ht.containsKey(val) && i - ht.get(val) <= k) {
                return true;
            }
            ht.put(val, i);
        }

        return false; 
    }
}