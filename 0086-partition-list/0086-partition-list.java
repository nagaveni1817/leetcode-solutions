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
    public ListNode partition(ListNode head, int x) {
        ListNode smalldummy=new ListNode(0);
        ListNode smalltail=smalldummy;
        ListNode bigdummy=new ListNode(0);
        ListNode bigtail=bigdummy;
        ListNode current=head;
        while(current!=null){
            if(current.val < x){
                smalltail.next=current;
                smalltail=current;

            }else{
                bigtail.next=current;
                bigtail=current;
            }
            current=current.next;
            

        }
        bigtail.next = null;
        smalltail.next=bigdummy.next;
        return smalldummy.next;
    }
}