class Solution {
    public String reverseVowels(String s) {
       char[] ch=s.toCharArray();
       int left=0;
       int right=s.length()-1;

       while(left<right){
        if ((ch[left] == 'a' || ch[left] == 'A' ||
            ch[left] == 'e' || ch[left] == 'E' ||
            ch[left] == 'i' || ch[left] == 'I' ||
            ch[left] == 'o' || ch[left] == 'O' ||
            ch[left] == 'u' || ch[left] == 'U') &&

            (ch[right] == 'a' || ch[right] == 'A' ||
            ch[right] == 'e' || ch[right] == 'E' ||
            ch[right] == 'i' || ch[right] == 'I' ||
           ch[right] == 'o' || ch[right] == 'O' ||
            ch[right] == 'u' ||ch[right] == 'U')) {
              char temp=ch[left];
              ch[left]=ch[right];
              ch[right]=temp;
              left++;
              right--;
         }
         else if(ch[left] == 'a' || ch[left] == 'A' ||
            ch[left] == 'e' || ch[left] == 'E' ||
            ch[left] == 'i' || ch[left] == 'I' ||
            ch[left] == 'o' || ch[left] == 'O' ||
            ch[left] == 'u' || ch[left] == 'U'){
                right--;
            }
            else if(ch[right] == 'a' || ch[right] == 'A' ||
            ch[right] == 'e' || ch[right] == 'E' ||
            ch[right] == 'i' || ch[right] == 'I' ||
           ch[right] == 'o' || ch[right] == 'O' ||
            ch[right] == 'u' ||ch[right] == 'U'){
                left++;
            }
            else{
                left++;
                right--;
            }
         
       } 
       String ans=new String(ch);
       return ans;
    }
}