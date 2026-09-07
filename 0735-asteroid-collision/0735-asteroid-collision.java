class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<n; i++){
            int ce=asteroids[i];
             if (s.isEmpty()) {
                s.push(ce);
            }
            else if( s.peek() > 0 && ce>0){
                s.push(ce);
            }
            else if( s.peek() < 0 && ce<0){
                s.push(ce);
            }
            else if(s.peek() < 0 && ce>0){
                s.push(ce);
            }
             else if (s.peek() > 0 && ce < 0) {
            while(!s.isEmpty() && s.peek() > 0 && ce<0){
                if(Math.abs(s.peek()) < Math.abs(ce)){
                    s.pop();
                }
                else if(Math.abs(s.peek()) == Math.abs(ce)){
                    s.pop();
                    ce=0;
                }else{
                    ce=0;
                }
            
            }

            if(ce!=0){
                s.push(ce);
            }
           
        }
        }
        int[] res=new int[s.size()];
        for(int i=res.length-1; i>=0; i--){
            res[i]=s.pop();
        }
        return res;
    }
}