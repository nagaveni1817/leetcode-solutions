class Solution {
    public int lastStoneWeight(int[] stones) {
          PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y){
                pq.offer(y-x);
            }

        }
        if(pq.size()==0){
            return 0;
        }
        return pq.peek();
    }
}