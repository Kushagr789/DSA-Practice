class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int i=1,j=2;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                if(i>=1&&nums[i]==nums[i-1]){
                    j++;
                }else{
                    i++;
                    int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                    j++;
                }
            }else{
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                j++;
            }
        }
        return i+1;
    }
}