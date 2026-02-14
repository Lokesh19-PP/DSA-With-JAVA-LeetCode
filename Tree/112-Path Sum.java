class Solution {
    private boolean flag = false;
    private void calculate(TreeNode root,int target,int sum){
        if(root == null) return;
        sum = sum + root.val;
        if(root.left == null && root.right == null){
            if(sum == target) flag=true;
            return;
        }
        if(root.left != null) calculate(root.left, target , sum);
        if(root.right != null) calculate(root.right, target , sum);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        calculate(root,targetSum,0);
        return flag;
    }
}