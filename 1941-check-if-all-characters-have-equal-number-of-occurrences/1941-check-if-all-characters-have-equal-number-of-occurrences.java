class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int firstfreq=-1;
        for(char c : map.keySet())
        {
            int freq=map.get(c);
            
            if(firstfreq == -1){

                firstfreq = freq;
            }else if(freq != firstfreq){
                return false;

            }
        }
        return true;

    }
}