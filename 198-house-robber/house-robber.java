class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
    
    if(n==1)
    return nums[0];
        int curr=0;
        int prev2=0;
        int prev=nums[0];
        for(int i=1;i<n;i++){
            int take=nums[i];
            if(i>1)
                take+=+prev2;
            int notTake=prev;
            curr=Math.max(take,notTake);
            prev2=prev;
            prev=curr;
        }
        return curr;
    }
}