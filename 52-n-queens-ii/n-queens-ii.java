class Solution {
    static void fun(char[][] board, int[] ans, int col){
        if(col==board.length){
            ans[0]++;
            return;
        }
        for(int row=0;row<board.length;row++){
            if(valid(board,row,col)){
                board[row][col]='Q';
                fun(board,ans,col+1);
                board[row][col]='.';
            }
        }
    }
    static boolean valid(char[][] board,int row,int col){
        int drow=row;
        int dcol=col;
        while(row>=0&&col>=0){
            if(board[row][col]=='Q')return false;
            row--;
            col--;
        }
        row=drow;
        col=dcol;
        while(col>=0){
            if(board[row][col]=='Q')return false;
            col--;
        }
        row=drow;
        col=dcol;
        while(col>=0&&row<board.length){
            if(board[row][col]=='Q')return false;
            col--;
            row++;
        }
        return true;
    }
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int[] ans=new int[1];
        ans[0]=0;
        fun(board,ans,0);
        return ans[0];
    }
}