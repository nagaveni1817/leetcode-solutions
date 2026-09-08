class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long total=0;
        int[] pse= new int[n];
        int[] nse=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<n; i++){
            
            while(!s.isEmpty() && arr[s.peek()] > arr[i]){
                s.pop();
            }
            if (s.isEmpty()) {
                pse[i] = -1;
            } else {
                pse[i] = s.peek();
            }
            s.push(i);
        }
        s.clear();
        for(int i=n-1; i>=0; i--){
            
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if (s.isEmpty()) {
                nse[i] = n;
            } else {
                nse[i] = s.peek();
            }
            s.push(i);
        }
        
       for(int i=0; i<n; i++){
            int left=i-pse[i];
            int right=nse[i]-i;
          
            final long mod = 1000000007L;
            total=(total+(long)right*left*arr[i]) % mod;
        }
        return (int) total;
    }
}