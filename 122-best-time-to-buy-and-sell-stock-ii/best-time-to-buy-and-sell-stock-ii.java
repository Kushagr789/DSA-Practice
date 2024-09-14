class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] dp=new int[2];
        int[] curr=new int[2];
        dp[0]=0;
        dp[1]=0;
        int pro=0;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==1){
                    pro=Math.max(
                        dp[0]-prices[i],dp[1]
                    );
                }else{
                    pro=Math.max(
                        dp[1]+prices[i],dp[0]
                    );
                }
                curr[j]=pro;
            }
            dp=curr;
        }
        return pro;
    }
}