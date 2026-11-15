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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       /* ListNode prev=null;
        ListNode curr=slow;
        while(curr !=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=head;
        ListNode right=prev;
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;*/
        ListNode cur=slow;
        if(fast!=null){
            cur=cur.next;  // for aodd length skip the middle one
        }
        Stack<Integer> s=new Stack<>();
        ListNode temp=head;
        while(temp!=slow){
            s.push(temp.val);
            temp=temp.next;
        }
        while(cur!=null){
            if (s.isEmpty()) {
                return false;
            }

            if(s.pop()!=cur.val){
                return false;
            }
            cur=cur.next;
        }
        return s.isEmpty();
    }
}