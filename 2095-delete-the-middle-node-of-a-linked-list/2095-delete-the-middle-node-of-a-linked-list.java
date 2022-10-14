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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null; 
        ListNode slow =head;
        ListNode fast =slow.next;
        int counter=1;
        
        while(fast.next!=null&& fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        
        return head;
    }
}

// S. S. S       F 
// 0 ,1 ,2 ,3 ,4 ,5 ,6

//0 ,1 ,2 ,3