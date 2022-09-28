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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1&& head.next ==null) return null;
        
        ListNode fast =head;
        ListNode slow =head;
        
        
        while(fast !=null&&fast.next!=null){
            fast= fast.next;
            if(n>0){
                n--;
            }else {
                slow=slow.next;
            }
        }
        if(n!=0){
            head=head.next;
        }else {
        slow.next= slow.next.next;

        }
        return head;
        
    }
}