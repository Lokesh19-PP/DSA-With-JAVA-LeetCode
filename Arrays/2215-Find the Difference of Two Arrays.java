class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1 = new HashSet<>();
        Set<Integer> n2 = new HashSet<>();
        for(int n : nums1) n1.add(n);
        for(int n : nums2) n2.add(n);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        for(int n : n1){
            if(!n2.contains(n)) temp1.add(n);
        }
        for(int n : n2){
            if(!n1.contains(n)) temp2.add(n);
        }
        ans.add(temp1);
        ans.add(temp2);
        return ans;
    }
}