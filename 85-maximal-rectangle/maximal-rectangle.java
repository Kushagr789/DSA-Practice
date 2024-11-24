class Solution {
    public int largestRectangleArea(int[] histo) {
        int n=histo.length;
        Stack<Integer> st=new Stack<>();
        int maxA = 0;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] psum=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                if(matrix[i][j]=='1'){
                    sum+=1;
                }else{
                    sum=0;
                }
                psum[i][j]=sum;
            }
        }
        int maxA=0;
        for(int i=0;i<n;i++){
            maxA=Math.max(maxA,largestRectangleArea(psum[i]));
        }
        return maxA;
    }
}