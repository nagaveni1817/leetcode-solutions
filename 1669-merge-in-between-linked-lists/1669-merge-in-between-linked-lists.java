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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode before=list1;
        for(int i=1; i<a; i++){
            before=before.next;
        }
        ListNode after=list1;
        for(int i=0; i<b+1; i++){
            after=after.next;

        }
        ListNode lastlist2=list2;
        while(lastlist2.next!=null){
            lastlist2=lastlist2.next;
        }
        before.next=list2;
        lastlist2.next=after;
        return list1;
    }
}