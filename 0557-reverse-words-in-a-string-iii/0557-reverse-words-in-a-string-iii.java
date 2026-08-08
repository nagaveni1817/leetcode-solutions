class Solution {
    public String reverseWords(String s) {
        String[] word=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<word.length; i++){
            sb.append(new StringBuilder(word[i]).reverse());
            if(i !=word.length-1){
                sb.append(" ");
            }

        }
        return sb.toString();
        
    }
}