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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
         return head;
        }
        int len=0;
        ListNode current=head;
        while(current!=null){
            len++;
            current=current.next;
        }
        int rotation=k % len;
        if(rotation == 0){
            return head;
        }
        ListNode tail=head;
        for(int i=1; i<len-rotation; i++){
            tail=tail.next;
        }
        ListNode newhead=tail.next;
        ListNode last=tail.next;
        while(last.next!=null){
            last=last.next;

        }
        last.next=head;
        tail.next=null;
        return newhead;

    }
}