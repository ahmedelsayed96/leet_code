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
    public ListNode oddEvenList(ListNode head) {
        
        boolean isOdd=true;
        ListNode initOdd =new ListNode();
        ListNode initEven =new ListNode();
        ListNode currentOdd=initOdd;
        ListNode currentEvent =initEven;
        
        while(head!=null){
            ListNode node= new ListNode(head.val);

            if(isOdd){
                currentOdd.next=node;
                currentOdd=currentOdd.next;
            }else{
                currentEvent.next=node; 
                currentEvent=currentEvent.next;
            }
            head=head.next;
            isOdd=!isOdd;
        }
        currentOdd.next =initEven.next;
        return initOdd.next;
    }
}