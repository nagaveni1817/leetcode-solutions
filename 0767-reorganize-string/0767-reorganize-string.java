class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(
            (a,b)-> {
                return b.getValue()-a.getValue();
            }
        );
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            pq.offer(entry);
        }
        Map.Entry<Character,Integer> prev=null;
            while(!pq.isEmpty()){
                Map.Entry<Character,Integer> cur=pq.poll();
               
                
                sb.append(cur.getKey());
                cur.setValue(cur.getValue()-1);
                if(prev!=null && prev.getValue()>0){
                    pq.offer(prev);
                }
                prev=cur;
            }
            if(prev.getValue()>0){
                return "";
            }
      
        return sb.toString();
    }
}