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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       ListNode dummy=new ListNode(0,head);
        ListNode before=dummy;
        for(int i=1;i<left;i++){
            before=before.next;
        }
        ListNode current=before.next;
        ListNode after=head;
        for(int i=1; i<=right; i++){
            after=after.next;
        }
        ListNode prev=after;
       
        while(current!=after){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        before.next=prev;
        return dummy.next;
    }
}