class Solution {
    private void preorder(TreeNode root,List<TreeNode> list){
        if(root == null){
            return;
        }
        list.add(root);
        preorder(root.left,list);
        preorder(root.right,list);
    }
    public void flatten(TreeNode root) {
        if(root == null ){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        preorder(root,list);

        for(int i=0;i<list.size()-1;i++){
            list.get(i).left = null;
            list.get(i).right = list.get(i+1);
        }
    }
}