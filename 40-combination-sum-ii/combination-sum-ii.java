class Solution {
    public static void rec(List<List<Integer>> ans,int target, int[] candidates,int ind,List<Integer> temp){
        if(target==0)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<candidates.length;i++){
            if(i>ind&& candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            temp.add(candidates[i]);
            rec(ans,target-candidates[i],candidates,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        rec(ans,target,candidates,0,new ArrayList<>());
        return ans;
    }
}