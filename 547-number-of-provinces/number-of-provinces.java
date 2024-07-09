class Solution {
    static void dfs(int n,int[] vis,ArrayList<ArrayList<Integer>>adj){
        vis[n]=1;
        for(Integer it:adj.get(n)){
            if(vis[it]==0){
                dfs(it,vis,adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int V=isConnected.length;
        for(int i=0;i<V;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(isConnected[i][j]==1&&i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[] vis=new int[V];
        int cnt=0;
        for(int i=0;i<V;i++)
        {
            if(vis[i]!=1){
            cnt++;
            dfs(i,vis,adj);
            }
        }
        return cnt;
    }
}