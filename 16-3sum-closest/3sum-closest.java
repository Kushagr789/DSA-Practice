class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closest=Integer.MAX_VALUE/2;
        for(int i=0;i<n-2;i++){
            int t=nums[i];
            int j=i+1,k=n-1;
            while(j<k){
                int sum=t+nums[j]+nums[k];
                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum<target)
                    j++;
                else if(sum>target)
                    k--;
                else
                    return sum;
            }
        }
        return closest;
    }
}