class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int count=0;
        int res=0;
        for(int right=0; right<s.length(); right++){
            char ch=s.charAt(right);
            if (ch =='a'||ch=='e'|| ch== 'i'|| ch== 'o'|| ch=='u'){
                count++;
            }
            if(right-left+1==k){
                res=Math.max(res,count);
                char chr=s.charAt(left);
            if (chr =='a'||chr =='e'|| chr == 'i'|| chr == 'o'|| chr =='u'){
                count--;
            }

               
               left++;
            }
        }
        return res;
    }
}