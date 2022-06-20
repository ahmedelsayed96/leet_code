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
    List<List<Integer>> list =new ArrayList<List<Integer>>();
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root ==null) return list ;
        List<Integer> levelList =new ArrayList<Integer>();
        levelList.add(root.val);
        list.add(levelList);
        zigzagLevelOrderWithLevel(root,1);
        return list ;
    }
    public void zigzagLevelOrderWithLevel(TreeNode root ,int level){
        if(root ==null) return ;
        List<Integer> levelList =new ArrayList<Integer>();
        boolean isRightSide = level%2 ==1 ;
        if(root.left!=null){
            if(isRightSide)
            levelList.add(0,root.left.val);
            else 
            levelList.add(root.left.val);
        }
        
        if(root.right!=null){
            if(isRightSide)
            levelList.add(0,root.right.val);
            else 
            levelList.add(root.right.val);
        }
        if(levelList.size()==0) return ;
        if(list.size()==level){
            list.add(levelList);
        }else {
            if(isRightSide)
            list.get(level).addAll(0,levelList);
            else list.get(level).addAll(levelList);
        }
        zigzagLevelOrderWithLevel(root.left,level+1);
        zigzagLevelOrderWithLevel(root.right,level+1);
    }
}