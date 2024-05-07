class Solution {
    public static void rec(List <List<Integer>> ans, int target, int[] candidates,int ind, List<Integer> temp){
        if(ind==candidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(temp));
                
            }
            return;
        }
        if(candidates[ind]<=target)
        {
            temp.add(candidates[ind]);
            rec(ans,target-candidates[ind],candidates,ind,temp);
            temp.remove(temp.size()-1);
        }
        rec(ans,target,candidates,ind+1,new ArrayList<>(temp));
            
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List <List<Integer>> ans=new ArrayList<>();
        rec(ans,target,candidates, 0, new ArrayList<>());
        return ans;
    }
}