class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1,c=nums.length;
        while(i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                j--;
                c--;
            }
            else{
                i++;
            }
        }
        return c;
    }
}