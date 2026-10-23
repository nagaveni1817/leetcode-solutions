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
    public int[] nextLargerNodes(ListNode head) {
        ListNode current=head;
        List<Integer> num=new ArrayList<>();
        while (current!=null){
            num.add(current.val);
            current=current.next;
        }
        int[] ans = new int[num.size()];
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<num.size(); i++){
            while(!s.isEmpty()&& num.get(s.peek())<num.get(i)){
                int ind=s.pop();
                ans[ind]=num.get(i);
            }
            s.push(i);
        }
        return ans;
        
    }
}