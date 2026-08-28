class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        int top=-1;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch=='('|| ch=='[' || ch=='{'){
                top++;
                stack.push(ch);
            }
           if(ch==')'|| ch==']' || ch=='}'){
              if(top==-1){
                return false;
              }else{
                char x=stack.peek();
                if(x=='(' && ch==')' || x=='[' && ch==']' || x=='{' && ch=='}'){
                    stack.pop();
                    top--;
                }else{
                    return false;
                }
              }
              
            
            }
        }
        if(top==-1){
            return true;
        }
        return false;
    }
}