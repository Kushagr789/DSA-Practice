class Solution {
    static void dfs(int n,int[] vis,int[][] isConnected,int V){
        vis[n]=1;
        for(int i=0;i<V;i++){
            if(vis[i]==0&&isConnected[n][i]==1&&i!=n){
                dfs(i,vis,isConnected,V);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        
        int V=isConnected.length;
        
        int[] vis=new int[V];
        int cnt=0;
        for(int i=0;i<V;i++)
        {
            if(vis[i]!=1){
            cnt++;
            dfs(i,vis,isConnected,V);
            }
        }
        return cnt;
    }
}