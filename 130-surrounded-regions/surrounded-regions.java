class Solution {
    static void dfs(int r,int c,int[][] vis,char[][] board,int[] dr,int[] dc){
        vis[r][c]=1;
        int n=board.length;
        int m=board[0].length;
        for(int z=0;z<4;z++){
            int x=r+dr[z];
            int y=c+dc[z];
            if(x>=0&&x<n&&y>=0&&y<m&&vis[x][y]==0&&board[x][y]=='O'){
                dfs(x,y,vis,board,dr,dc);
            }
        }
    }
    public void solve(char[][] board) {
        int[] dr={0,0,1,-1};
        int[] dc={1,-1,0,0};
        int n=board.length;
        int m=board[0].length;
        int[][] vis=new int[n][m];
        for(int j=0;j<m;j++){
            if(vis[0][j]==0&&board[0][j]=='O'){
                dfs(0,j,vis,board,dr,dc);
            }
            if(vis[n-1][j]==0&&board[n-1][j]=='O'){
                dfs(n-1,j,vis,board,dr,dc);
            }
        }

        for(int i=0;i<n;i++){
            if(vis[i][0]==0&&board[i][0]=='O'){
                dfs(i,0,vis,board,dr,dc);
            }
            if(vis[i][m-1]==0&&board[i][m-1]=='O'){
                dfs(i,m-1,vis,board,dr,dc);
            }
        }
        for(int i = 0;i<n;i++) {
            for(int j= 0 ;j<m;j++) {
                if(vis[i][j] == 0 && board[i][j] == 'O') 
                    board[i][j] = 'X'; 
            }
        }

    }
}