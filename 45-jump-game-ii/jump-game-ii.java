class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1)return 0;
        int jum=0,far=0,r=0;
        for(int i=0;i<nums.length;i++){
            far=Math.max(far,i+nums[i]);
            if(i==r){
                jum++;
                r=far;
                if(r>=nums.length-1)break;
            }
        }
        return jum;
    }
}