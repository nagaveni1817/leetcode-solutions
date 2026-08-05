class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
       
        int res=0;
        
        HashSet<Character> set=new HashSet<>();

        for(int right=0; right<s.length(); right++){
            char ch=s.charAt(right);
           
            while(set.contains(ch)) {
               
                set.remove(s.charAt(left));
                left++;

            }
            set.add(ch);
            res=Math.max(res,right-left+1);
            
        }
        return res;
    }
}