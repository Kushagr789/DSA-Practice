class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||i==n-1||j==0||j==m-1){
                    if(grid[i][j]==1){
                        q.add(new Pair(i,j));
                        vis[i][j]=1;
                    }
                }
            }
        }
        int[] dr={0,0,1,-1};
        int[] dc={1,-1,0,0};
        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
            for(int i=0;i<4;i++){
                int nr=r+dr[i];
                int nc=c+dc[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&grid[nr][nc]==1&&vis[nr][nc]==0){
                    vis[nr][nc]=1;
                    q.add(new Pair(nr,nc));
                }
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&vis[i][j]==0)
                    cnt++;
            }
        }
        return cnt;
    }
}
class Pair{
    int first;
    int second;
    Pair(int r,int c){
        this.first=r;
        this.second=c;
    }
}