class Solution {
    static int n,m;
    static void dfs(int r,int c,int[][]grid){
        if(r<0||r>=n||c<0||c>=m)
            return;
        if(grid[r][c]==0) return;
        grid[r][c]=0;
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
        dfs(r+1,c,grid);
        dfs(r-1,c,grid);
    }
    public int numEnclaves(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            if(grid[i][0]==1)
                dfs(i,0,grid);
            if(grid[i][m-1]==1)
                dfs(i,m-1,grid);
        }
        for(int i=0;i<m;i++){
            if(grid[0][i]==1)
                dfs(0,i,grid);
            if(grid[n-1][i]==1)
                dfs(n-1,i,grid);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                cnt+=grid[i][j];
        }
    
        return cnt;
    }
}
