class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List <int[]> result = new ArrayList<>();
        int i=0;
        int n=intervals.length;
        int start1= newInterval[0];
        int end1= newInterval[1];
        while(i<n && intervals[i][1]<start1){
            result.add(intervals[i]);
            i++;
        } 
        while(i<n && intervals[i][0]<=end1){
            start1=Math.min(start1, intervals[i][0]);
            end1= Math.max(end1, intervals[i][1]);
            i++;
        }
        result.add(new int[]{start1,end1});
        while(i<n){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
        
    }
}