class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0]==1||grid[n-1][n-1]==1) return -1;
        
        int[] dx={0,1,0,-1,1,-1,1,-1};
        int[] dy={1,0,-1,0,1,1,-1,-1};
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(1,0,0));
        grid[0][0]=1;
        while(!q.isEmpty()){
            Node node=q.remove();
            int d=node.dist;
            int r=node.row;
            int c=node.col;
            if(r==n-1&&c==n-1)return d;
            for(int i=0;i<8;i++){
                int nr=r+dx[i];
                int nc=c+dy[i];
                if(nr>=0&&nr<n&&nc>=0&&nc<n&&grid[nr][nc]==0){
                    
                    q.add(new Node(d+1,nr,nc));
                    
                    grid[nr][nc]=1;
                }
            }
        }
           
        return -1;
        
    }
}
class Node{
            int dist,row,col;
            Node(int dist,int row, int col){
                this.dist=dist;
                this.row=row;
                this.col=col;
            }
        }