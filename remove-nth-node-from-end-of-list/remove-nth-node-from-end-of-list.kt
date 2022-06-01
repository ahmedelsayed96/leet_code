/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
         if(head!!.next==null) return null;
        var res = head;
        var resIndex =-n;
        var current =head;
        var beforLast=head;
       
        while(current!!.next!=null){
            
            resIndex++;
            current=current.next;

            if(resIndex >= 0){
                beforLast =res;
                res=res!!.next
            }

        }
        
        if(res!!.next!=null){
            res!!.`val`=res!!.next.`val`;
            res.next=res.next.next;
        }else{
            if(beforLast!=null){
                beforLast!!.next=null;
            }
        }
        
        
        
        
        return head; 
        
    }
}