class Solution {
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int[][] dp=new int[2][k+1];
        int[][] curr=new int[2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                for(int cap=1;cap<=k;cap++){
                    if(buy==0){
                        curr[buy][cap]=Math.max(
                            dp[1][cap]-prices[i],
                            dp[0][cap]
                        );
                    }
                    if(buy==1){
                        curr[buy][cap]=Math.max(
                            dp[1][cap],
                            prices[i]+dp[0][cap-1]
                        );
                    }
                }
            }
            dp=curr;
        }
        return dp[0][k];
    }
}