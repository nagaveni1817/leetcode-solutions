class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         int sum=0,tot=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            tot+=nums[i];
            sum+=nums[i];
            max=Math.max(sum,max);
            if(sum<0) sum=0;
        }
        if (max < 0) {
            return max;
        }
        sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            min=Math.min(sum,min);
            if(sum>0) sum=0;
        }

       
       
        return  Math.max(max, tot - min);
       /* int currentmin=nums[0];
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
        return Math.max(maxsum,totalsum-minsum);*/
    }
}