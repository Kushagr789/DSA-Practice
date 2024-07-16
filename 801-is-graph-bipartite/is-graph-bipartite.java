class Solution {
    private static boolean dfs(int node,int col,int[] color,int[][] graph){
        color[node]=col;
        for(int i=0;i<graph[node].length;i++){
            int it=graph[node][i];
            if(color[it]==-1){
                if(dfs(it,1-col,color,graph)==false)return false;
            }
            else if(color[it]==col) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int[] color=new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(dfs(i,0,color,graph)==false) return false;
            }
        }
        return true;
    }
}