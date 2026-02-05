class Solution {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=getLeftHeight(root);
        int right=getRightHeight(root);
        if(left == right){
            return (1<<left)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int getLeftHeight(TreeNode node){
        int H=0;
        while(node != null){
            H++;
            node=node.left;
        }
        return H;
    }
    public int getRightHeight(TreeNode node){
        int H=0;
        while(node != null){
            H++;
            node=node.right;
        }
        return H;
    }
}