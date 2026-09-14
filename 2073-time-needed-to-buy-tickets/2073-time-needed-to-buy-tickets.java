class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int t=0;
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n; i++){
            q.offer(i);
        }
        while(true){
            int p=q.poll();
            tickets[p]--;
            t++;
            if(p==k && tickets[p]==0){
                return t;
            }
            if(tickets[p]>0){
                q.offer(p);
            }
        }
    }
}