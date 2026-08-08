class Solution {
    public String reverseWords(String s) {
        String str=s.trim();
        String[] s1=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--){
            sb.append(s1[i]+" ");

        }
        String str1=sb.toString();
        String str2=str1.trim();
        return str2;
    }
}