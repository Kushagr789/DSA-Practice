class Solution {
    public int findMin(int[] nums) {
       
    
        int l=0,r=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]<nums[r]){
                ans=Math.min(ans,nums[mid]);
                r=mid;
            }
            else if(nums[mid]>nums[r]){
                
                l=mid+1;
            }else{
                r--;
            }
            
        }
        return nums[l];
    }
}