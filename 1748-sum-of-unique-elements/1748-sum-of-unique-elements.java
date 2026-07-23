class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int sum=0;
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(freq==1){
                sum=sum+num;
            }
        }
        return sum;
    }
}