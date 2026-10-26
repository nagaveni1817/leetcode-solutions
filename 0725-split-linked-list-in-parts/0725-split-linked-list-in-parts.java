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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode current=head;
        int n=0;
        while(current!=null){
            n++;
            current=current.next;
        }
        int size=n/k;
        int extra=n%k;
        ListNode[] res=new ListNode[k];
        current=head;
        
        for(int i=0; i<k; i++){
            int partsize=size+(i<extra?1:0);
            ListNode parthead=current;
            for(int j=1; j<partsize && current!=null; j++){
                current=current.next;

            }if(current!=null){

            
            ListNode nextpart=current.next;
            current.next=null;
            current=nextpart;
            }
            res[i]=parthead;
        }
        return res;
    }
}