class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int left=0;
        int len=1;
      for(int right=1; right<nums.length; right++){
        if(nums[right]>nums[right-1]){
            len=Math.max(len,right-left+1);
         }
        else{
            left=right;
        }
      }
      return len;
    }
}