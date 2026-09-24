class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
          int j=0;
       // List<Integer> res = new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0; i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
          
            if(i>=k-1){
                res[j]=nums[dq.peekFirst()];
                j++;
                //res.add(nums[dq.peekFirst()]);
            }
        }
        return res;
    }
}