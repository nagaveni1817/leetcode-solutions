class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] word=s.split(" ");
         if (pattern.length() != word.length) {
           return false;
       }
      
       HashMap<Character,String> map1=new HashMap<>();
       HashMap<String,Character> map2=new HashMap<>();
     
       for(int i=0; i<pattern.length(); i++){
        char ch=pattern.charAt(i);
        if(map1.containsKey(ch)){
            if(!map1.get(ch).equals(word[i]) ){
                return false;
            }
        }
         if(map2.containsKey(word[i])){
            if( !map2.get(word[i]).equals(ch)) {
                return false;
            }
         }
            else{
            map1.put(ch,word[i]);
            map2.put(word[i],ch);
            }
           
        

       } 
       return true;
    }
}