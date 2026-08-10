class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int[] prefixsum = new int[nums.length];;
        int count=0;
        prefixsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];

        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(prefixsum[i]-k)){
                count+=map.get(prefixsum[i]-k);
            }
            map.put(prefixsum[i],map.getOrDefault(prefixsum[i],0)+1);

        }
        return count;

        /* 
       int sum=0;
       for(int num:nums){
            sum+=num;
        
           if(map.containsKey(sum - k))
            count+= map.get(sum-k);
        
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;*/



    }
}