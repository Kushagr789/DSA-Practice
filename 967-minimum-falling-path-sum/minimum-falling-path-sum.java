class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] dp=new int[n][m];
        for(int j=0;j<m;j++){
            dp[n-1][j]=matrix[n-1][j];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int dgf=(int)1e9,dgb=(int)1e9,d=(int)1e9;
                if(j>0){
                    dgb=matrix[i][j]+dp[i+1][j-1];
                }
                if(j<m-1){
                    dgf=matrix[i][j]+dp[i+1][j+1];
                }
                d=matrix[i][j]+dp[i+1][j];
                dp[i][j]=Math.min(d,Math.min(dgf,dgb));
            }
        }
        int min=(int)1e9;
        for(int i=0;i<m;i++){
            min=Math.min(dp[0][i],min);
        }
        return min;
    }
}