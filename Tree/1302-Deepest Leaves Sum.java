class Solution {
    private int depth = 0;
    private int sum = 0;
    private int findDepth(TreeNode root){
        if(root == null) return 0;
        return depth = 1 + Math.max(findDepth(root.left),findDepth(root.right));
    }
    private  void findSum(TreeNode root, int currdepth){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null && currdepth == depth){
            sum = sum + root.val;
        }
        findSum(root.left,currdepth+1);
        findSum(root.right,currdepth+1);
        
    }
    public int deepestLeavesSum(TreeNode root) {
        findDepth(root);
        findSum(root,1);
        return sum;
    }
}