class Solution {
    private void solve(int n, int k, List<Integer> curr, List<List<Integer>> list){
        if(k==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(n==0) return;

        curr.add(n);
        solve(n-1, k-1, curr, list);

        curr.remove(curr.size()-1);
        solve(n-1, k, curr, list);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        solve(n,k,new ArrayList<>(),list);
        return list;
    }
}