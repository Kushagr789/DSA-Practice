class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null||grid.length==0)return 0;
        int rows=grid.length;
        int cols=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]!=0)
                fresh++;
                if(grid[i][j]==2)
                q.offer(new int[]{i,j});
            }
        }
        if(fresh==0)return 0;
        int cnt=0,cntMin=0;
        int dx[]={0,1,0,-1};
        int dy[]={1,0,-1,0};

        while(!q.isEmpty()){
            int size=q.size();
            cnt+=size;
            for(int i=0;i<size;i++){
                int[] point=q.poll();
                for(int j=0;j<4;j++){
                    int x=point[0]+dx[j];
                    int y=point[1]+dy[j];
                    if(x<0||y<0||x>=rows||y>=cols||grid[x][y]==0||grid[x][y]==2)
                        continue;
                    grid[x][y]=2;
                    q.offer(new int[]{x,y});
                }
            }
            if(q.size()!=0){
                cntMin++;
            }
        }
        return fresh==cnt?cntMin:-1;
    }
}