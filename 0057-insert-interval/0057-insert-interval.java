class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> res = new ArrayList<>();

        int s = newInterval[0];
        int e = newInterval[1];

        int i = 0;
        while (i < intervals.length && intervals[i][1] < s) {
            res.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= e) {
            s = Math.min(s, intervals[i][0]);
            e = Math.max(e, intervals[i][1]);
            i++;
        }
        res.add(new int[]{s, e});
        while (i < intervals.length) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}