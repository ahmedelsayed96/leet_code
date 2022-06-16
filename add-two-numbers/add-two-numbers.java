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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0; 
        ListNode init= new ListNode();
        ListNode current =init;
        while(l1!=null || l2!=null || carry!=0){
            
            int val =carry;
            carry=0;
            if(l1!=null){
                val+=l1.val;
            }
            if(l2!=null){
                val+=l2.val;
            }
            if(val>9){
            carry=val/10;
            val=val%10;
            }
            
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
            current.next =new ListNode(val);
            current=current.next;
        }
       
        return init.next;
    }
}