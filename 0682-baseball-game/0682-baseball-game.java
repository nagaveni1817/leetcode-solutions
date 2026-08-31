class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Deque<Integer> stack= new ArrayDeque<>();
        for(int i=0; i< operations.length; i++){
          String x=operations[i];
          if(x.equals("+")){
            if(!stack.isEmpty()){
                int f=stack.pop();
                int s=stack.peek();
                sum=f+s;
                stack.push(f);
                stack.push(sum);
            }
          }
           else if(x.equals("D")){
                int p=stack.peek();
                int m=p*2;
                stack.push(m);

            }
           else if(x.equals("C")){
                stack.pop();
            }
            else{
                 stack.push(Integer.parseInt(x));
            }
          
           
          
        }
        int final_sum=0;
        while (!stack.isEmpty()) {
            final_sum += stack.pop();
        }
        return final_sum;
    }
}