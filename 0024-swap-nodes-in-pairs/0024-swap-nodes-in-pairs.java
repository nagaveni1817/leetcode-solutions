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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
        ListNode first=head;
        ListNode second=head.next;
        
        while(first!=null && first.next!=null){
            ListNode nextpair=second.next;
            prev.next=second;
            second.next=first;
            first.next=nextpair;
            prev = first;
            first = nextpair;

            if (first != null) {
                second = first.next;
            }
        }
        return dummy.next;
    }
}