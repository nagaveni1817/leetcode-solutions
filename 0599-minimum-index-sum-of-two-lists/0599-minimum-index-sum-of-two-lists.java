class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       int minsum=Integer.MAX_VALUE;
       int sum=0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
            
        }
       ArrayList<String> str = new ArrayList<>();
        for(int i=0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                int index=map.get(list2[i]);
                sum=index+i;
                if(sum < minsum){
                    minsum=sum;
                    str.clear();
                    str.add(list2[i]);
                }
                else if(sum==minsum){
                  str.add(list2[i]);
                }
               
            }
            
            
        }
     return str.toArray(new String[0]);
    }
    
}