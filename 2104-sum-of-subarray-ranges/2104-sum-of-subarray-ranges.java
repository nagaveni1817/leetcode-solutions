class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        int[] pse=new int[n];
        int[] nse=new int[n];
        int[] pge=new int[n];
        int[] nge=new int[n];
        long sum_min=0;
        long sum_max=0;

        Stack<Integer> s=new Stack<>();
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && nums[s.peek()]>nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                pse[i]=-1;
            }
            if(!s.isEmpty()){
                pse[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && nums[s.peek()]>=nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nse[i]=n;
            }
            if(!s.isEmpty()){
                nse[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<n; i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            
            sum_min+=(long)nums[i]*left*right;
        }
        s.clear();
        for(int i=0; i<n; i++){
            while(!s.isEmpty() && nums[s.peek()]<nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                pge[i]=-1;
            }
            if(!s.isEmpty()){
                pge[i]=s.peek();
            }
            s.push(i);
        }
        s.clear();
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nge[i]=n;
            }
            if(!s.isEmpty()){
                nge[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0; i<n; i++){
            int left=i-pge[i];
            int right=nge[i]-i;
           
            sum_max+=(long)nums[i]*left*right;
        }
        return sum_max-sum_min;


    }
}