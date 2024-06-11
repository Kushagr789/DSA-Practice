class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int max=-1;
            int j=i;
            int left=0,right=0;
            while(j>=0){
                left=Math.max(height[j],left);
                j--;
            }
            j=i;
            while(j<n){
                right=Math.max(height[j],right);
                j++;
            }
            int ans=Math.min(left,right)-height[i];
            if(ans>=0)
            sum+=ans;
        }
        return sum;
    }
}