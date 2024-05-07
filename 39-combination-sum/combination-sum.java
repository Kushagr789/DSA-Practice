class Solution {
    public static void rec(List <List<Integer>> ans, int target, int[] candidates,int ind, List<Integer> temp){
        
        if(target<0)return;
            if(target==0)
            {
                ans.add(new ArrayList<>(temp));
                return;
            }
            
    
        for (int i = ind; i < candidates.length; i++) {
            temp.add(candidates[i]); 
            rec(ans, target-candidates[i], candidates, i, temp); 
            temp.remove(temp.size() - 1); 
            }
        
            
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List <List<Integer>> ans=new ArrayList<>();
        rec(ans,target,candidates, 0, new ArrayList<>());
        return ans;
    }
}