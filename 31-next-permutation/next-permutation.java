class Solution {
    public static void reverse(int[] nums, int l, int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length,ind=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
        if(ind==-1)
        reverse(nums,0,n-1);
        else{
            for(int i=n-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
                int temp=nums[ind];
                nums[ind]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        reverse(nums,ind+1,n-1);
        }
        
    }
}