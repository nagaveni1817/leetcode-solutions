class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        
        
        for(int right=0;right<p.length(); right++){
            char ch=p.charAt(right);
           freq1[ch-'a']++;
        }
        int left=0;
        for(int right=0;right<s.length(); right++){
            char ch1=s.charAt(right);
            freq2[ch1-'a']++;
            if((right-left+1)==p.length()){
                if(Arrays.equals(freq1,freq2)){
                    list.add(left);
                }
                char ch3 = s.charAt(left);
                 freq2[ch3-'a']--;
                 left++;
            }
           
        }


      return list;
    }
}