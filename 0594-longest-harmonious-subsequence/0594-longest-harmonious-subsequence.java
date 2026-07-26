class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++ ){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxlen=0;
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]+1)){
              int len=map.get(nums[i])+map.get(nums[i]+1);
               maxlen = Math.max(maxlen, len);  
            }

        }
        return maxlen;
    }
}