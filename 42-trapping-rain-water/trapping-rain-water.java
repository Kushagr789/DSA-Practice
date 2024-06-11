class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int leftMax=0;
        int rightMax=0;
        left[0]=0;
        left[n-1]=0;
        right[0]=0;
        right[n-1]=0;
        for(int i=1;i<n-1;i++){
            if(height[i-1]>leftMax)
            leftMax=height[i-1];
            left[i]=leftMax;
            
        }
        for(int i=n-2;i>0;i--){
            if(height[i+1]>rightMax)
            rightMax=height[i+1];
            right[i]=rightMax;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            
            int ans=Math.min(left[i],right[i])-height[i];
            if(ans>=0)
            sum+=ans;
        }
        return sum;
    }
}