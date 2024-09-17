class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] hash=new int[n];
        int last=0,max=-1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            hash[i]=i;
            for(int prev=0;prev<i;prev++){
                if(nums[i]%nums[prev]==0&&dp[prev]+1>dp[i]){
                    dp[i]=1+dp[prev];
                    hash[i]=prev;
                }
            }
            if(dp[i]>max){
                max=dp[i];
                last=i;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(nums[last]);
        while(hash[last]!=last){
            last=hash[last];
            ans.add(nums[last]);
        }
        Collections.reverse(ans);
        return ans;
    }
}