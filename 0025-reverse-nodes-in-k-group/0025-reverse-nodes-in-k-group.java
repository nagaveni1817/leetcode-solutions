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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode dummy =new ListNode(0,head);
       ListNode grpprev=dummy;
       while(true){
       ListNode kth=grpprev;
       for(int i=0; i<k; i++){
        kth=kth.next;
        if(kth==null){
            return dummy.next;
        }
       }
       ListNode grpnext=kth.next;
       ListNode prev=grpnext;
       ListNode curr=grpprev.next;
       while(curr!=grpnext){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       ListNode oldgrpfirst=grpprev.next;
       grpprev.next=kth;
        grpprev=oldgrpfirst;
       }
       
    }
}