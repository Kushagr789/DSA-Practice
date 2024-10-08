class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[] dp=new int[m+1];
        for(int j=0;j<=m;j++)
            dp[j]=0;
       
        
        for(int i=1;i<=n;i++){
            int[] curr=new int[m+1];
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    curr[j]=1+dp[j-1];
                }else{
                    curr[j]=Math.max(dp[j],curr[j-1]);
                }
            }
            dp=curr;
        }
        return dp[m];
    }
}