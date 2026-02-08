class Solution {
    public void consider(int[] candidates,int target,int start,List<Integer> temp,List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target){
                return;
            }
            temp.add(candidates[i]);
            consider(candidates,target-candidates[i],i,temp,list);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        consider(candidates,target,0,new ArrayList<>(),list);
        return list;
    }
}