class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for( String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(
            (a,b) -> {if(!a.getValue().equals(b.getValue())){
                return a.getValue()-b.getValue();
            }
            return b.getKey().compareTo(a.getKey());
    });
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(0,pq.poll().getKey());
        }
        return ans;
    }
}