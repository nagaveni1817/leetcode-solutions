class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int maxlen=0;
        int basket=2;
        int right=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right<fruits.length){
            if(map.containsKey(fruits[right])){
             map.put(fruits[right], map.get(fruits[right])+1);
             
            }
             else{
                map.put(fruits[right],1);
             }
             if(map.size()>basket){
                while(map.size()>basket){
                    if (map.get(fruits[left]) == 1) {
                        map.remove(fruits[left]);}
                    else{
                        map.put(fruits[left], map.get(fruits[left]) - 1);
                    }
                    left++;  
                }
             }
               if(map.size()<=basket){
                maxlen=Math.max(maxlen,right-left+1);
               }
               right++;
          
              
        }
        return maxlen;
    }
}