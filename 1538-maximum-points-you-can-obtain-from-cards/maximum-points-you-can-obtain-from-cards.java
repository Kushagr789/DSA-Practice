class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=cardPoints.length,r=k-1,max=0,sum=0;
        for(int i=0;i<k;i++)
        sum+=cardPoints[i];
        max=sum;
        while(r>-1){
            sum-=cardPoints[r];
            r--;
            l--;
            sum+=cardPoints[l];
            max=Math.max(max,sum);
        }
        return max;
    }
}