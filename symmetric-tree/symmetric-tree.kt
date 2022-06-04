/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if(root==null) return true ;
        if(root.right==null ||root.left==null) return root.right==root.left;
        if(root!!.right!!.`val`!=root!!.left!!.`val`)return false;
        
        return isSymmetricChild(root.left,root.right);
    }
    fun isSymmetricChild(left: TreeNode?, right: TreeNode?) :Boolean{
        if(right==null ||left==null) return right==left;
            if(right!!.`val`!=left!!.`val`)return false;

        return isSymmetricChild(left!!.right,right!!.left) && isSymmetricChild(left!!.left,right!!.right) ;
    }
    
}