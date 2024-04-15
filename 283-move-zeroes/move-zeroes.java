class Solution {
    public void moveZeroes(int[] nums) {
        int j=0,i=0;
        while(j<nums.length){
            if(nums[j]==0)
            j++;
            else
            {
                nums[i]=nums[j];
                i++;
                j++;
            }
        }
        while(i<nums.length)
        {
            nums[i]=0;
            i++;
        }
    }
}