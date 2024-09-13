class Solution {
    static boolean allStar(String s,int i){
        for(int x=1;x<=i;x++){
            if(s.charAt(x-1)!='*')
                return false;
        }
        return true;
    }
    public boolean isMatch(String p, String s) {
        int n=s.length();
        int m=p.length();
        boolean[][] dp=new boolean[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=allStar(s,i);
        }
        for(int j=0;j<=m;j++){
            dp[0][j]=false;
        }
        dp[0][0]=true;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||s.charAt(i-1)=='?')
                    dp[i][j]=dp[i-1][j-1];
                else if(s.charAt(i-1)=='*')
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                else
                    dp[i][j]=false;
            }
        }
        return dp[n][m];
    }
}