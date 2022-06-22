/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return null; 
        if(root.left==null) return root;
        Node head = root;
        Node current =root;
        Node next  = root.left;
        while(next!=null){
            while(current!=null){
                current.left.next=current.right;
                if(current.next!=null){
                   current.right.next= current.next.left;
                }
                current=current.next;
            }
            
            current =next;
            next = next.left;
        }
        return head;
    }
}