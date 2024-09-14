class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n+1][2][k+1];
        dp[n][0][k]=0;
        dp[n][1][k]=0;
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=k;cap++){
                    if(buy==0){
                        dp[i][buy][cap]=Math.max(
                            dp[i+1][1][cap]-prices[i],
                            dp[i+1][0][cap]
                        );
                    }
                    if(buy==1){
                        dp[i][buy][cap]=Math.max(
                            dp[i+1][1][cap],
                            prices[i]+dp[i+1][0][cap-1]
                        );
                    }
                }
            }
        }
        return dp[0][0][k];
    }
}