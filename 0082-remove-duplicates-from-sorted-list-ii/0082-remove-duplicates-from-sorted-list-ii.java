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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0); // creating the dummy node 0
        dummy.next=head;  /// dummy next points to head
        ListNode current=dummy; //   current points to dummy not to head cause we need to check the the head also to find the duplicate sometimes tht will also be a duplicate od next elem
        while(current.next!=null){
            if(current.next.next!=null && current.next.val==current.next.next.val){
                int duplicate=current.next.val;
                while(current.next!=null && current.next.val==duplicate){
                    current.next=current.next.next;
                }
            }else{
                current=current.next;
            }
        }
    return dummy.next;
  }
}