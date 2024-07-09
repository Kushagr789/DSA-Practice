class Solution {
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image == null || image.length == 0 || sr < 0 || sc < 0) {
            return image;
        }

        int iniColor = image[sr][sc];
        if (iniColor == color) {
            return image;
        }

        int[][] ans = image;
        int n = image.length;
        int m = image[0].length;
        
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sr, sc});
        ans[sr][sc] = color;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            for (int i = 0; i < 4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == iniColor && ans[nrow][ncol] != color) {
                    ans[nrow][ncol] = color;
                    queue.add(new int[]{nrow, ncol});
                }
            }
        }

        return ans;
    }
}