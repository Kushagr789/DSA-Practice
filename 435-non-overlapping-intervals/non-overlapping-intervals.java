class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        int res=0;
        if(intervals.length==0||intervals==null)
            return 0;
        Arrays.sort(intervals, (a, b) -> a[1]-b[1]);
        int s=intervals[0][1];
        
        for(int i=1;i<n;i++){
            if(s>intervals[i][0]){
                res++;
            }
            else{
                s=intervals[i][1];
            }
            
        }
        
        return res;
    }
}