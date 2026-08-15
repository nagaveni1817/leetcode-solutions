class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0,tot=0;
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length; i++){
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
        }
      
        sum=0;
        for(int i=0;i<nums.length; i++){
            sum+=nums[i];
            minsum=Math.min(minsum,sum);
            if(sum>0){
                sum=0;
            }
        }
        
        return Math.max(Math.abs(maxsum),Math.abs(minsum));

    }
}