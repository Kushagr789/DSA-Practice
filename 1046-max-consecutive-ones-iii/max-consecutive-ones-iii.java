class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length,maxLen=0;
        int zeros=0,l=0,r=0;
        while(r<n){
            if(nums[r]==0)
            zeros++;
            while(zeros>k)
            {
                if(nums[l]==0)
                zeros--;
                l++;
            }
            if(zeros<=k)
            maxLen=Math.max(maxLen,r-l+1);

            r++;
        }
        return maxLen;
    }
}