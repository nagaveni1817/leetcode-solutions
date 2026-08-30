

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> s1 = new ArrayDeque<>();
        Deque<Character> s2 = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if (!s1.isEmpty()) {
                   s1.pop();
            }
            }else{
                s1.push(ch);
            }
        }
         for(int i=0; i<t.length(); i++){
            char ch=t.charAt(i);
            if(ch=='#'){

                if(!s2.isEmpty()){
                    s2.pop();
                }
              
            }else{
                s2.push(ch);
            }
        }

        while (!s1.isEmpty() && !s2.isEmpty()) {

            if (s1.pop() != s2.pop()) {
                return false;
            }
        }
        return s1.isEmpty() && s2.isEmpty();
    }
}