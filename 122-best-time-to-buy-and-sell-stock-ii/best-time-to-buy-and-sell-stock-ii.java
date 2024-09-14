class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n+1][2];
        dp[n][0]=0;
        dp[n][1]=0;
        int pro=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==1){
                    pro=Math.max(
                        dp[i+1][0]-prices[i],dp[i+1][1]
                    );
                }else{
                    pro=Math.max(
                        dp[i+1][1]+prices[i],dp[i+1][0]
                    );
                }
                dp[i][j]=pro;
            }
        }
        return pro;
    }
}