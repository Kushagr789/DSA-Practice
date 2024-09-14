class Solution {
    public int maxProfit(int[] prices, int fee) {
      int n=prices.length;
        int[] dp=new int[2];
        int[] curr=new int[2];
        int pro=0;
        for(int i=n-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                if(buy==0){
                    pro=Math.max(
                        dp[1]-prices[i],
                        dp[0]
                    );
                }
                if(buy==1){
                    pro=Math.max(
                        dp[0]+prices[i]-fee,
                        dp[1]
                    );
                }
                curr[buy]=pro;
            }
            dp=curr.clone();
        }
        return dp[0];  
    }
}