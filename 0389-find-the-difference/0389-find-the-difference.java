class Solution {
    public char findTheDifference(String s, String t) {
        /*int sl=s.length();
        int tl=t.length();
        if(s1==0){
            return 
        }*/

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c1=s.charAt(i);
            map.put(c1,map.getOrDefault(c1,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char c1=t.charAt(i);
            map.put(c1,map.getOrDefault(c1,0)-1);
        }
        for (char ch : map.keySet()){
            int freq = map.get(ch);

             if (freq != 0) {
                 return ch;
              }
        }

     return 0 ;

    }
}