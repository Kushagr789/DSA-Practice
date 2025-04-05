class Solution {
    public int[] countBits(int n) {
        int dp[] =new int[n+1];
        dp[0]=0;
        if(n<1)
        return dp;
        dp[1]=1;
        if(n<2)
        return dp;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i/2]+dp[i%2];
        }
        return dp;
    }
}