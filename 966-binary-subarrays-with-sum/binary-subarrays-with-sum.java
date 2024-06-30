class Solution {
    public static int find(int[] nums, int goal){
        int l=0,r=0,count=0,n=nums.length,sum=0,cnt=0;
        while(r<n){
            sum+=nums[r];
            while(sum>goal&&l<=r){
                sum-=nums[l];
                l++;
            }
            cnt+=(r-l+1);
            r++;
        }
        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal<0)return 0;
        int x=find(nums,goal);
        int y=find(nums,goal-1);
        return (x-y);
    }
}