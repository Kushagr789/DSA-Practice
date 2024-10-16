class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1,max=0;
        while(left<right){
            int h=(height[left]>height[right])?height[right]:height[left];
            int w=right-left;
            max=Math.max(max,h*w);
            if(height[right]>height[left])
                left++;
            else
                right--;
        }
        return max;
    }
}