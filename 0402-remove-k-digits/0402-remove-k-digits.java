class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> s=new Stack<>();
        for(int i=0; i<n; i++){
            char ce=num.charAt(i);
            while(!s.isEmpty() && k>0 && s.peek() > ce){
                s.pop();
                k--;
            }
            s.push(ce);
        }
         while(k>0){
                s.pop();
                k--;
            }
           
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        sb.reverse();
        if(sb.length()==0){
            return "0";
        }
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
         return sb.toString();
    }
}