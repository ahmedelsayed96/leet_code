/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    int t =0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        
        StringBuilder res =new StringBuilder("");
        if(root==null) return "";
        TreeNode head =root;
        treeToString(root,res);
        return res.toString();
        
    }
    
    private void treeToString(TreeNode root, StringBuilder res ){
        if(root==null) {
            res.append("N,");
            return ;
        }
        
        res.append(root.val+",");
        treeToString(root.left,res);
        treeToString(root.right,res);
        
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] list = data.split(",");
       
        
        return stringToTreeNode(list);
    }
    
    private TreeNode stringToTreeNode(String[] list){
        if(list[t].equals("N")|| list[t].isEmpty()|| t>=list.length) return null ;
        TreeNode root=new TreeNode(Integer.parseInt(list[t]));
        t++;
        root.left= stringToTreeNode(list);
        t++;
        root.right =stringToTreeNode(list);
        
        return root;
        
    }

    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));