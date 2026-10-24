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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode left=head;
        ListNode right =head;
        int n=0;
        ListNode current=head;
        while(current!=null){
            n++;
            current=current.next;

        }
        for(int i=1; i<k;i++){
            left=left.next;
        }
        for(int i=1; i<n-k+1;i++){
            right=right.next;
        }
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
        return head;
        

    }
}