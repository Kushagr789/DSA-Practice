class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] vis=new int[n][m];
        int[][] dis=new int[n][m];
        Queue<Node>q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new Node(i,j,0));
                    vis[i][j]=1;
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int[] dr={0,0,1,-1};
        int[] dc={1,-1,0,0};

        while(!q.isEmpty()){
            int r=q.peek().first;
            int c=q.peek().second;
            int d=q.peek().third;
            q.remove();
            dis[r][c]=d;
            for(int j=0;j<4;j++){
                int nr=r+dr[j];
                int nc=c+dc[j];
                if(nr>=0&&nr<n&&nc>=0&&nc<m&&vis[nr][nc]==0){
                    vis[nr][nc]=1;
                    q.add(new Node(nr,nc,d+1));
                }
            }
        }
        return dis;
    }
}
class Node{
    int first,second,third;
    Node(int x,int y,int z){
        this.first=x;
        this.second=y;
        this.third=z;
    }
}