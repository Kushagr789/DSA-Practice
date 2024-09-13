class Solution {
    static int lcp(String s,int n){
        String rev=new StringBuilder(s).reverse().toString();
        int[] dp=new int[n+1];
        for(int j=0;j<=n;j++){
            dp[j]=0;
        }
        for(int i=1;i<=n;i++){
            int[] curr=new int[n+1];
            for(int j=1;j<=n;j++){
                if(rev.charAt(i-1)==s.charAt(j-1)){
                    curr[j]=1+dp[j-1];
                }else{
                    curr[j]=Math.max(dp[j],curr[j-1]);
                }
            }
            dp=curr;
        }
        return dp[n];
    }
    public int minInsertions(String s) {
        int n=s.length();
        return n-lcp(s,n);
    }
}