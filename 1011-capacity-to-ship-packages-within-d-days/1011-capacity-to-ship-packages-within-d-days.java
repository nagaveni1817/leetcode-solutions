class Solution {
    public int shipWithinDays(int[] weights, int days) {
          int max=0;
          int sum=0;
          for(int weight: weights){
            sum+=weight;
            if(weight >max){
                max=weight;
            }
        }
        int left=max;
        int right=sum;
        while(left<right){
            int mid=left+(right-left)/2;
            int day=1;
            int currentweight=0;
            for(int weight: weights){
                if(currentweight + weight <= mid){
                        currentweight+=weight;
                }else{
                    day++;
                    currentweight=weight;
                }
            }
            if(day <= days){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;


    }
}