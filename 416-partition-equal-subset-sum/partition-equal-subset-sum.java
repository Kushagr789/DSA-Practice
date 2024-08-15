class Solution {
    static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean[] prev=new boolean[sum+1];
        
        prev[0]=true;
        if(arr[0]<=sum)
            prev[arr[0]]=true;
        for(int i=1;i<N;i++){
            boolean[] curr=new boolean[sum+1];
            curr[0]=true;
            for(int j=1;j<=sum;j++){
                boolean notTake=prev[j];
                boolean take=false;
                if(arr[i]<=j){
                    take=prev[j-arr[i]];
                }
                curr[j]=(take||notTake);
            }
            prev=curr;
        }
        return prev[sum];
    }
    public boolean canPartition(int[] nums) {
        int totSum=0;
        for(int i=0;i<nums.length;i++)
            totSum+=nums[i];
        if(totSum%2!=0)return false;

        return isSubsetSum(nums.length,nums,(totSum/2));
    }
}