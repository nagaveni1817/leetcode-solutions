class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int freq=map.getOrDefault(nums[i],0);
                if(freq>0){
                    count=count+freq;
                }
                
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        /*int count=0;
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(freq>=2){
                count++;
            }
        }*/
        return count;
    }
}