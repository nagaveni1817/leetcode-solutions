class Solution {
    public boolean isAnagram(String s, String t) {
       

       if(s.length() != t.length()){
        return false;}
      

      HashMap<Character,Integer>  maps= new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
       
       char ch = s.charAt(i);
       maps.put(ch,maps.getOrDefault(ch,0)+1);
       }

       HashMap<Character,Integer>  mapt= new HashMap<>();
       for (int j = 0; j < t.length(); j++) {
       
       char cs = t.charAt(j);
       mapt.put(cs,mapt.getOrDefault(cs,0)+1);
       }
      
    return maps.equals(mapt);

    }
    
}
