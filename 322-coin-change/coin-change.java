class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        int[] curr=new int[amount+1];
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0)
                dp[i] = i / coins[0];
            else
                dp[i] = (int) Math.pow(10, 9);
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<=amount;j++){
                int take=(int)1e9;
                int notTake=dp[j];
                if(coins[i]<=j){
                    take=1+curr[j-coins[i]];
                }
                curr[j]=Math.min(take,notTake);
            }
            dp=curr;
        }
        if(dp[amount]<(int)1e9)
        return dp[amount];
        else
        return -1;
    }
}