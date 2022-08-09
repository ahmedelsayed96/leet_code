/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode head = new ListNode();
        ListNode current = head;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(Comparator.comparingInt(a -> ((ListNode) a).val));
        for(ListNode node : lists){
            if(node!=null)
            queue.add(node);
        }
        while(!queue.isEmpty()){
            current.next=queue.poll();
            current =current.next;
            if(current.next!=null){
                queue.add(current.next);
                current.next=null;
            }
        }
        
        return head.next;
        
    }
}