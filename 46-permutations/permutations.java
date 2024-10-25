class Solution {
    static void fun(List<List<Integer>> ans, int[] nums,List<Integer> temp,int ind){
        if(ind>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
            fun(ans,nums,temp,ind+1);
            temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        fun(ans,nums,new ArrayList<>(),0);
        return ans;
    }
}