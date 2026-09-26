class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int i=0; i<nums.length; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       } 
       PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> a[1]-b[1]);
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        pq.offer(new int[]{entry.getKey(),entry.getValue()});
        if(pq.size() > k){
            pq.poll();
        }
       }
       int[] res=new int[k];
       for(int i=0;i<k;i++){
        res[i]=pq.poll()[0];
       }
       return res;
    }
}