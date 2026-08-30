class Solution {
    public String removeDuplicates(String s) {
      Deque<Character> stack = new ArrayDeque<>();
      for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        if(stack.isEmpty()){
            stack.push(ch);
        }else{
            char x=stack.peek();
            if(ch == x){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
      }
       StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
      return result.reverse().toString();
    }
}