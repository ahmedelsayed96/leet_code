/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Map<Node,Node> map = new HashMap<Node,Node>();
        Node current = head;
        while(current!=null){
            map.put(current, new Node(current.val));
            current=current.next;
            
        }
        current = head;
        
        while(current!=null){
            Node copy= map.get(current);
            copy.next = map.get(current.next);
            copy.random = map.get(current.random);
            current=current.next;
        }
        
        return map.get(head);
    }
}