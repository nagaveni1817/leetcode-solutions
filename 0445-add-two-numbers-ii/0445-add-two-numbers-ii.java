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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=0;
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode cur1=l1;
        ListNode cur2=l2;
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
      //  ListNode prev=null;
        while(cur1!=null){
           s1.push(cur1.val);
            cur1=cur1.next;
        }
        
        while(cur2!=null){
            s2.push(cur2.val);
            cur2=cur2.next;
        }
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0){
            
            int val1=!s1.isEmpty() ? s1.pop():0;
            int val2=!s2.isEmpty() ? s2.pop():0;
            
            sum=val1+val2+carry;
            carry=sum/10;
            int digit=sum%10;
            ListNode current=new ListNode(digit);
            current.next=dummy.next;
            dummy.next=current;

        }

        return dummy.next;
    }
}