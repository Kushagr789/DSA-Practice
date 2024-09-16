class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        int[] curr=new int[n+1];
        for(int ind=n-1;ind>=0;ind--){
            for(int prev=ind-1;prev>=-1;prev--){
                int notTake=dp[prev+1];
                int take=0;
                if(prev==-1||nums[ind]>nums[prev]){
                    take=1+dp[ind+1];
                }
                curr[prev+1]=Math.max(take,notTake);
            }
            dp=curr;
        }
        return dp[0];
    }
}