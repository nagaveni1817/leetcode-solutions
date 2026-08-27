class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int count=0;
        int s=intervals[0][0];
        int e=intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            int cs=intervals[i][0];
            int ce=intervals[i][1];

            if(cs<e){
                count++;
                e=Math.min(ce,e);
            }else{
                e=ce;
            }
        }
       return count;
    }
}