class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0; i<n;i++){
            q.offer(i);
        }
        int[] res=new int[n];
        for(int card: deck){
            int pos=q.poll();
            res[pos]=card;
            if(!q.isEmpty()){
                int ele=q.poll();
                q.offer(ele);
            }
        }
        return res;

    }
}