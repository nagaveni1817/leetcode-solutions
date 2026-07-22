class Solution {
    public int majorityElement(int[] nums) {
        int maxfreq=0;
        int maxkey=2;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i< nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(int num: map.keySet()){
            int freq=map.get(num);
            if(freq > maxfreq){
                maxfreq = freq;
                maxkey=num;
            }
        }
       
        return maxkey;
    }
}