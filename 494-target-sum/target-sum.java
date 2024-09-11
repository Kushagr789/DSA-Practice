class Solution {
    static int find(int[] nums,int target){
        int[] prev=new int[target+1];
        
        if(nums[0]==0)
            prev[0]=2;
        else 
            prev[0]=1;

        if (nums[0] != 0 && nums[0] <= target)
            prev[nums[0]] = 1;

        for(int ind=1;ind<nums.length;ind++){
            int[] curr=new int[target+1];
            for(int tar=0;tar<=target;tar++){
                int notTake=prev[tar];
                int take=0;
                if(nums[ind]<=tar){
                    take=prev[tar-nums[ind]];
                }
                curr[tar]=take+notTake;
            }
            prev=curr;
        }
        return prev[target];
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int total=0;
        for(int i=0;i<n;i++)
            total+=nums[i];

            if (total - target < 0 || (total - target) % 2 == 1)
            return 0;
        return find(nums,((total-target)/2));
    }
}