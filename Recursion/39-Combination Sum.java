class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(candidates,target,0,new ArrayList<>(),0,ans);
        return ans;
    }
    void fun(int[] c,int tr,int i,List<Integer> temp,int sum,List<List<Integer>> ans){
        if(sum == tr){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(c.length == i) return;
        fun(c,tr,i+1,temp,sum,ans);
        if(sum + c[i] <= tr) {
            temp.add(c[i]);
            fun(c,tr,i,temp,sum+c[i],ans);
            temp.remove(temp.size()-1);
        }
        return;
    }
}