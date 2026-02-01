class Solution {
    public TreeNode divider(int[] nums,int start, int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode tree=new TreeNode(nums[mid]);
        tree.left=divider(nums,start,mid-1);
        tree.right=divider(nums,mid+1,end);
        return tree;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int len=nums.length;
        return divider(nums,0,len-1);
    }
}