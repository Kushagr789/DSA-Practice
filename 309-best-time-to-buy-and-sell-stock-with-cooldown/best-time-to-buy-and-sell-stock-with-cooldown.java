class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n+2][2];
        int pro=0;
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                if(buy==0){
                    pro=Math.max(
                        dp[i+1][1]-prices[i],
                        dp[i+1][0]
                    );
                }
                if(buy==1){
                    pro=Math.max(
                        dp[i+2][0]+prices[i],
                        dp[i+1][1]
                    );
                }
                dp[i][buy]=pro;
            }
        }
        return dp[0][0];
    }
}