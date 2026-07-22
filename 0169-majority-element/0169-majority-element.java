class Solution {
    public int majorityElement(int[] nums) {
        int maxfreq=0;
        int maxkey=2;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i< nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(int i=0; i<nums.length; i++){
            int freq=map.get(nums[i]);
            if(freq > maxfreq){
                maxfreq = freq;
                maxkey=nums[i];
            }
        }
       
        return maxkey;
    }
}