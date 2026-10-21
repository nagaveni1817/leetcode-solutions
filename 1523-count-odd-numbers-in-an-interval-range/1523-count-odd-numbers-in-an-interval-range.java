class Solution {
    public int countOdds(int low, int high) {
        int count=0;
       // for(int i=low; i<=high; i++){
       int i=low;
         if(i%2==0){
            i++;
         }
          while(i<=high){
            if(i%2!=0){
                count++;
            }
            i+=2;
        }
        return count;
    }
}