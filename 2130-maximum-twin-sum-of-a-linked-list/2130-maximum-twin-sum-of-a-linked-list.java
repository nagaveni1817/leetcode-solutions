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
    public int pairSum(ListNode head) {
       List<Integer> arr=new ArrayList<>();
       ListNode current=head;
       while(current!=null){
        arr.add(current.val);
        current=current.next;
       } 
       int n=arr.size();
       int max=0;
       for(int i=0;i<n;i++){
        int sum=arr.get(i)+arr.get(n-1-i);
        max=Math.max(max,sum);
       }
       return max;
    }
}