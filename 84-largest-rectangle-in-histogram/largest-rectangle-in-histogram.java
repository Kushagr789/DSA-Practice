class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        Stack<Integer> st=new Stack<>();
        int[] left =new int[n];
        int right[] =new int[n];
        for(int i=0;i<n;i++){
            while(!st.empty()&&heights[st.peek()]>=heights[i])
            st.pop();
            if(st.empty())left[i]=0;
            else left[i]=st.peek()+1;

            st.push(i);
        }
        while(!st.empty())
        st.pop();
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&& heights[st.peek()]>=heights[i])
            st.pop();
            if(st.empty())right[i]=n-1;
            else right[i]=st.peek()-1;

            st.push(i);
        }
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,heights[i]*(right[i]-left[i]+1));
        }
        return maxArea;
    }
}