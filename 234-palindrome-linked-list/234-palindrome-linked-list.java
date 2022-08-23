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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        if(head.next ==null) return true;
        ListNode prev = head ;
        
        ListNode slow =head.next;
        ListNode fast = head.next.next;
        prev.next=null;
        if(fast == null) return prev.val==slow.val;
        
        
        while(fast!=null&& fast.next!=null){
            ListNode temp =slow.next;
            slow.next =prev;
            prev =slow ;
            slow =temp ;
            fast=fast.next.next;
        }
        if(fast!=null) slow= slow.next;
        while(slow!=null && prev!=null){
            if(slow.val!=prev.val) return false;
            slow=slow.next;
            prev =prev.next;
        }
        
        return true;
        
        
    }
}