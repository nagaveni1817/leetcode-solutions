class Solution {
    public String frequencySort(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>(
            (a,b)->{
                return b.getValue() - a.getValue();
            }
        );
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            pq.offer(entry);
            
        }
        while (!pq.isEmpty()) {
          Map.Entry<Character, Integer> entry = pq.poll();
          char ch = entry.getKey();
          int freq = entry.getValue();

          for (int i = 0; i < freq; i++) {
            result.append(ch);
          }
        }
        return result.toString();
    }
}