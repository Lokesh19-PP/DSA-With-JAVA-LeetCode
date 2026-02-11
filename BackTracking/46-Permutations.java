class Solution {
    private void calculated(int[] nums,int i, List<List<Integer>> list){
        if(i == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int n : nums){
                temp.add(n);
            }
            list.add(temp);
            return;
        }
        for(int j=i;j<nums.length;j++){
            swap(nums,i,j);
            calculated(nums,i+1,list);
            swap(nums,i,j);
        }
    }
    private void swap(int[] nums,int i,int j){
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        calculated(nums,0,list);
        return list;
    }
}