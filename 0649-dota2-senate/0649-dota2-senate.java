class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
       Queue<Integer> r=new ArrayDeque<>();
       Queue<Integer> d=new ArrayDeque<>();
       for(int i=0; i<n; i++){
         char ch=senate.charAt(i);
        if(ch == 'R'){
            r.offer(i);
        }else{
            d.offer(i);
        }
       
       } 
       for(int i=0; i<n; i++){
        while(!r.isEmpty() && !d.isEmpty()){

        
             if(r.peek() < d.peek() ){
                d.poll();
                r.offer(r.poll() + n);
             }else{
                r.poll();
                d.offer(d.poll()+n);
             }
         }
       }
       return r.isEmpty() ? "Dire" : "Radiant";
    }
}