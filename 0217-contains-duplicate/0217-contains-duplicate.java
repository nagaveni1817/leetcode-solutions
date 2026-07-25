class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        /*for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num : map.keySet()){
            int freq=map.get(num);
            if(freq>=2){
                return true;
            }
        }
        return false;*/

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}