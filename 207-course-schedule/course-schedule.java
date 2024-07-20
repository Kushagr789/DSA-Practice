class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int arr[]:prerequisites){
            adj.get(arr[1]).add(arr[0]);
        }

        int[] in=new int[numCourses];


        for(int i=0;i<numCourses;i++)
            for(int j:adj.get(i))
                in[j]++;

        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }

        int cnt=0;
        while(!q.isEmpty()){
            int n=q.poll();
            cnt++;
            for(int it:adj.get(n)){
                in[it]--;
                if(in[it]==0)q.add(it);
            }
        }
        if(cnt==numCourses)return true;
        return false;
    }
}