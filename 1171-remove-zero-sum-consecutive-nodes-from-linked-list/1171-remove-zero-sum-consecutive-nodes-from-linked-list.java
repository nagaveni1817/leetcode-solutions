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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        HashMap<Integer,ListNode> map=new HashMap<>();
        int prefixsum=0;
        ListNode current=dummy;
        while(current!=null){
            prefixsum+=current.val;
            map.put(prefixsum,current);
            current=current.next;
        }
        prefixsum=0;
        current=dummy;
        while(current!=null){
            prefixsum+=current.val;
            current.next=map.get(prefixsum).next;
            current=current.next;
        }
        return dummy.next;
    }
}