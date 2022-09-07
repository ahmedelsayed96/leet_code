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
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        StringBuilder text =new StringBuilder();
        text.append(root.val);
        if(root.left==null& root.right!=null) text.append("()");
        treeToString(root.left,text);
        treeToString(root.right,text);
        
        return text.toString();
    }   
    public void  treeToString(TreeNode root,StringBuilder builder){
        if(root==null) return ;
        builder.append("(");
        builder.append(root.val);
        if(root.left==null && root.right!=null) builder.append("()");
        treeToString(root.left,builder);
        treeToString(root.right,builder);
        builder.append(")");
        
        
        
    }
}