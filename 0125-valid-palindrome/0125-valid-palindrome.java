class Solution {
    public boolean isPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            
            }else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            
            }
           char leftch = Character.toLowerCase(s.charAt(left));
           char rightch = Character.toLowerCase(s.charAt(right));
            if(leftch!=(rightch)){
                return false;
            }else{
                    left++;
                    right--;
                
              
            }
        }
        return true;
    }
}