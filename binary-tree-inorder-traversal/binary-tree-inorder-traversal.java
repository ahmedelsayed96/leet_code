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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList();
        if(root==null) return list;
        Stack<TreeNode> stack =new Stack<TreeNode>();
        TreeNode current =root;
        while(current!=null || !stack.isEmpty()){
            
            while(current !=null){
                stack.add(current);
                current=current.left;
            }
            
            current =stack.pop();
            list.add(current.val);
            current=current.right;
        }
        
        return list ;
    }
}