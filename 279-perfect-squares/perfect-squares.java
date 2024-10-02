class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int j=1;j<=n;j++){
            int min=(int)1e9;
            for(int i=1;i<=Math.sqrt(j);i++){
                int sq=i*i;
                int curr=1+dp[j-sq];
                min=Math.min(curr,min);
            }
            dp[j]=min;
        }
        return dp[n];
    }
}