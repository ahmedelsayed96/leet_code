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
    fun isValidBST(root: TreeNode?): Boolean {
        
       
        return valid(root,Int.MIN_VALUE.toLong()-1,Int.MAX_VALUE.toLong()+1);
    }
    
    fun valid(node: TreeNode? , left:Long ,right:Long) :Boolean{
        if(node ==null) return true;
        if (!(node!!.`val`.toLong() >left&&node!!.`val`.toLong()<right )) return false;
        
        return valid(node.left,left,node.`val`.toLong()) &&valid(node.right,node.`val`.toLong(),right);
    }
     

    
    
}