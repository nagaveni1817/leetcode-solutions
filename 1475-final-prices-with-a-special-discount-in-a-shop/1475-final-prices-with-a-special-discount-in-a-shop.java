class Solution {
    public int[] finalPrices(int[] prices) {
       int n=prices.length;
       int[] ans=new int[n];
       Stack<Integer> s=new Stack<>();
       
       for(int i=n-1; i>=0; i--){
        int cp=prices[i];
        while(!s.isEmpty() && s.peek() > cp){
            s.pop();
        }
        if(s.isEmpty()){
           ans[i]=cp;
        
        }
        if(!s.isEmpty()){
           ans[i]=cp-s.peek();
        }

       s.push(cp);
       }
      return ans;
    }
}