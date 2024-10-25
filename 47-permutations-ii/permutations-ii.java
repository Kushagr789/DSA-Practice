class Solution {
    static void fun(List<List<Integer>> ans, List<Integer> temp,int[] nums,int ind,boolean[] used){
        if(temp.size()==nums.length){
            if(!ans.contains(temp))
            ans.add(new ArrayList<>(temp));
            return;
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(used[i]||i>0&&nums[i]==nums[i-1]&&!used[i-1])
                continue;
            used[i]=true;
            temp.add(nums[i]);
            fun(ans,temp,nums,ind+1,used);
            temp.remove(temp.size()-1);
            used[i]=false;
        }}
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        fun(ans,new ArrayList<>(),nums,0,used);
        return ans;
    }
}