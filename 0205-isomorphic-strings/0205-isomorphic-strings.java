class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            char ch1=t.charAt(i);
            if(map.containsKey(ch) ){
             if(map.get(ch) != ch1 ){
                return false;
             }
            }
             if(map2.containsKey(ch1) ){
             if(map2.get(ch1) != ch ){
                return false;
             }
            }
            else{
              map.put(ch,ch1);
              map2.put(ch1,ch);
            }
           
          
        

       }
       return true;
    }
}