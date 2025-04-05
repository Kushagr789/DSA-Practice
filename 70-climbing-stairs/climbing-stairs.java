class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        int prev=1;
        int curr=1;
        for(int i=2;i<=n;i++){
            int temp=curr+prev;
            prev=curr;
            curr=temp;
        }
        return curr;
    }
}