class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int[][] result= new int [intervals.length][2];
        int index=0;
        int start1= intervals[0][0];
        int end1= intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(start2<=end1){
                end1=Math.max(end1,end2);
            }
            else {
                result[index][0] = start1;
                result[index][1] = end1;
                index++;

                start1 = start2;
                end1 = end2;
            }
        }

        result[index][0] = start1;
        result[index][1] = end1;

        return Arrays.copyOf(result, index + 1);

        }
        
    }