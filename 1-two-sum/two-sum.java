import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {

       int i=0,n=nums.length,j=n-1;
        int []ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            int rem=target-nums[i];
            if(map.containsKey(rem))
            {
                ans[0]=i;
                ans[1]=map.get(rem);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}