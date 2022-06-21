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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        int rootVal =preorder[0];
        TreeNode root = new TreeNode(rootVal);
        if (preorder.length == 1)
            return root;

        int mid =indexOfArray(preorder,rootVal);
        int midInter =indexOfArray(inorder,rootVal);
        int n=preorder.length;
        int m = inorder.length;
        int[] leftPreOrder =Arrays.copyOfRange(preorder,1,midInter+1);
        int[] leftInterOrder =Arrays.copyOfRange(inorder,0,midInter);
        root.left = buildTree(leftPreOrder, leftInterOrder);

        int[] rightPreOrder =Arrays.copyOfRange(preorder,mid+midInter+1,n);
        int[] rightInterOrder =Arrays.copyOfRange(inorder,midInter+1,m);
        root.right = buildTree( rightPreOrder, rightInterOrder);

        
        return root;
        
    }
    
    public int indexOfArray(int[] array,int val){
        for(int i=0;i<array.length;i++){
            if(array[i]==val){
                return i;
            }
        }
        return -1;
    }
}