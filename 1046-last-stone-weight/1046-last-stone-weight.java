class Solution {
    public int lastStoneWeight(int[] stones) {
          PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            pq.offer(stone);  // to add stones to the queue
        }
        while(pq.size()>1){
            int y=pq.poll();  // to choose 1st heaviest
            int x=pq.poll(); // to choose 2nd heaviest
            if(x!=y){
                pq.offer(y-x); // to pust remained stone y
            }

        }
        if(pq.size()==0){
            return 0;
        }
        return pq.peek();
    }
}