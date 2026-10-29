class Solution {
    public String interpret(String command) {
        String ans="";
        for(int i=0; i<command.length(); i++){
            char ch=command.charAt(i);
            if(ch =='G'){
                ans=ans+"G";

            }
            else if(ch=='(' && command.charAt(i+1) ==')'){
                ans=ans+"o";
                i++;
            }
            else if(ch=='('){
                ans=ans+"al";
                i+=3;
            }
        }
        return ans;

    }
}