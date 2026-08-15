class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currentmin=nums[0];
        int minsum=nums[0];
        int totalsum=nums[0];
        int currentsum=nums[0];
        int maxsum=nums[0];

     
      
        for(int i=1; i<nums.length; i++){
            totalsum+=nums[i];
            currentsum=Math.max(nums[i], currentsum+nums[i]);
            maxsum=Math.max(maxsum,currentsum);

            currentmin=Math.min(nums[i],currentmin+nums[i]);
            minsum=Math.min(minsum,currentmin);
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum-minsum);
    }
}