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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode nexthalf = slow.next;
        slow.next = null;
        ListNode current=nexthalf;
        ListNode prev=null;

        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            ListNode nextfirst=first.next;
            ListNode nextsec=second.next;

            first.next=second;
            second.next=nextfirst;

            first=nextfirst;
            second=nextsec;
        }

    }
}