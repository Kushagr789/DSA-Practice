class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,1);
        int left=1;
        for(int i=0;i<nums.length;i++){
            ans[i]=ans[i]*left;
            left=left*nums[i];
        }
        int right=1;
        for(int j=nums.length-1;j>=0;j--){
            ans[j]=ans[j]*right;
            right=right*nums[j];
        }

        return ans;
    }
}