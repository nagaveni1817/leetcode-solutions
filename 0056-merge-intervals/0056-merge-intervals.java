class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1; i<intervals.length; i++){
                  int cs=intervals[i][0];
                  int ce=intervals[i][1];

                  if(cs<=end){
                    end=Math.max(end,ce);
                  }else{
                    res.add(new int[]{start,end});
                    start=cs;
                    end=ce;
                  }
                  
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);

    }
}