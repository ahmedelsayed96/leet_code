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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        var list  = mutableListOf<MutableList<Int>>();
        if(root==null) return list;

        addingToList(root,0,list);
        return list;
    }
    fun addingToList(node:TreeNode?,index:Int,list:MutableList<MutableList<Int>>){
        if(node ==null ) return ;
        if(list.size -1  < index){
            list.add(index,mutableListOf<Int>(node!!.`val`));
        }else {
            list.get(index).add(node!!.`val`);
        }
        addingToList(node.left,index+1,list);
        addingToList(node.right,index+1,list);

        
    }
}