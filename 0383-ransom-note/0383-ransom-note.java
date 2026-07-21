class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r=ransomNote.length();
        int m=magazine.length();
        if(r>m){
            return false;
        }
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0; i<r;i++){
            char ch1=ransomNote.charAt(i);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
         HashMap<Character,Integer> map2=new HashMap<>();
        for(int j=0; j<m;j++){
            char ch2=magazine.charAt(j);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        for(char ch:map1.keySet()){
            /*char ch1=ransomNote.charAt(i);
            char ch2=magazine.charAt(i);*/
             int fr1=map1.get(ch);
             int fr2=map2.getOrDefault(ch,0);
             if (fr1>fr2){
                return false;
             }
            
        }
      return true;
    }
}