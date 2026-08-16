class Solution {
    public int xorOperation(int n, int start) {
       /*int[] arr=new int[n];
       int ans=0;
       List<Integer> list=new ArrayList<>();

        for(int i=0; i<n;i++){
           int a=start+2*i;
           list.add(a);
           
        }
         for(int i=0; i<n;i++){
           ans^=list.get(i);
           
        }
       return ans;*/
       int ans=0;
        for(int i=0; i<n;i++){
          ans^=(start+2*i);
           
        }
        return ans;

    }
}