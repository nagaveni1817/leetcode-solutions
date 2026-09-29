class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char task: tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int task: map.values()){
            pq.offer(task);
        }
        int time=0;
        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            for(int i=0; i<=n; i++){
                if(!pq.isEmpty()){
                    int freq=pq.poll();
                    freq--;
                    if(freq>0){
                    temp.add(freq);
                    }
                    time++;
                }
                else{
                    if(!temp.isEmpty()){
                        time++;
                    }
                }
               
            }
            for(int frq: temp){
                pq.offer(frq);
            }
        }
        return time;
    }
}