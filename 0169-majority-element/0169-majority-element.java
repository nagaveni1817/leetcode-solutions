class Solution {
    public int majorityElement(int[] nums) {
       /* int maxfreq=0;
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
       
        return maxkey;*/
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxfreq=n/2;
        for(int num: nums){
            int frq=map.get(num);
            if(frq>maxfreq){
                return num;
            }    
        }
        return -1;
    }
}