class Solution {
    public String longestCommonPrefix(String[] strs) {
        String p=strs[0];
        for(int i=1; i<strs.length;i++){
            String str=strs[i];
           // int j=0;
            while(/*j < p.length() && j < str.length() && p.charAt(j) == str.charAt(j)*/ !str.startsWith(p) )
            {
               // j++;
               p=p.substring(0,p.length()-1);
           }
           //p=p.substring(0,j);
        }
      return p;
    }
}