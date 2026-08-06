class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        
        for(int right=0; right<s1.length(); right++){
            char ch=s1.charAt(right);
            freq1[ch-'a']++;
        }
        int left=0;
        for(int right=0; right<s2.length(); right++){
            char ch1=s2.charAt(right);
            freq2[ch1-'a']++;
            if((right-left+1)==s1.length()){
                if(Arrays.equals(freq1,freq2)){
                    return true;
                }
                char ch2=s2.charAt(left);
                freq2[ch2-'a']--;
                left++;
            }
        }
        return false;
    }
}