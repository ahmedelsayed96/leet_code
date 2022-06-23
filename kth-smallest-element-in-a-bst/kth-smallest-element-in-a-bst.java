/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> list =new ArrayList<TreeNode>();
        Stack<TreeNode> stack =new Stack<TreeNode>();
        TreeNode current=root;
        while(current!=null|| !stack.isEmpty()){
        
            while(current!=null){
                stack.add(current);
                current=current.left;
            }
            current =stack.pop();
            list.add(current);
            if(list.size()==k){
                return list.get(k-1).val;
            }
            current=current.right;
            
        
        }
        
        return -1;
        
    }
}