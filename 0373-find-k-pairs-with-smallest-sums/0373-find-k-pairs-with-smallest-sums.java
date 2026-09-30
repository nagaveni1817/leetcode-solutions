class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        /*PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->{
                int sumA=a[0]+a[1];
                int sumB=b[0]+b[1];
                return sumB-sumA;
            }
        );
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                int[] pair={nums1[i], nums2[j]};
                pq.offer(pair);
                if(pq.size()>k){
                    pq.poll();
                }
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        while(!pq.isEmpty()){
            int[] pair=pq.poll();
            res.add(Arrays.asList(pair[0],pair[1]));
        }
        return res;*/
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)->{
                int sumA=nums1[a[0]]+nums2[a[1]];
                int sumB=nums1[b[0]]+nums2[b[1]];
                return sumA-sumB;
            }
        );
        for(int i=0; i<Math.min(k,nums1.length); i++){
            pq.offer(new int[]{i,0} );
        }
          List<List<Integer>> res=new ArrayList<>();
        while(k>0 && !pq.isEmpty()){
            int[] pair=pq.poll();
            int i=pair[0];
            int j=pair[1];
            res.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1<nums2.length){
                pq.offer(new int[]{i,j+1});
            }
            k--;

        }
        return res;
    }
}