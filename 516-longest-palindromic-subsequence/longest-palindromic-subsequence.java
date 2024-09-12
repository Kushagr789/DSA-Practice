class Solution {
    public int longestPalindromeSubseq(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        int n=s.length();
        int m=rev.length();
        int[] dp=new int[m+1];
        for(int j=0;j<=m;j++){
            dp[j]=0;
        }
        for(int i=1;i<=n;i++){
            int[] curr=new int[m+1];
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==rev.charAt(j-1))
                    curr[j]=1+dp[j-1];
                else
                    curr[j]=Math.max(dp[j],curr[j-1]);
            }
            dp=curr;
        }
        return dp[m];
    }
}