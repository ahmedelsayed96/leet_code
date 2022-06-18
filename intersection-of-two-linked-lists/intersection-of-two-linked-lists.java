/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       ListNode currentA =headA;
       ListNode currentB =headB;
       int countA=count(headA);
       int countB =count(headB);
       int skip =Math.abs(countB-countA);
       for(int i=0;i<skip ;i++){
           if(countA>countB){
               currentA=currentA.next;
           }else{
               currentB=currentB.next;
           }
       }
        
        while(currentA!=null){
            if(currentA==currentB){
                return currentA;
            }
            currentB=currentB.next;
            currentA=currentA.next;

        }

        return null;
    }
    public int count(ListNode head){
        ListNode current =head;
        int count =0;
        while(current!=null){
           count++;
           current=current.next;
        }
        return  count;
    }
}