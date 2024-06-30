class Solution {
    public static int find(int[] nums,int k){
        int l=0,r=0,cnt=0,c=0;
        while(r<nums.length){
            if(nums[r]%2!=0)
            cnt++;
            while(cnt>k){
                if(nums[l]%2!=0)
                cnt--;
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int x=find(nums,k);
        int y=find(nums,k-1);
        return (x-y);
    }
}