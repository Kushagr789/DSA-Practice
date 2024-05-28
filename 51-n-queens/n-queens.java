class Solution {
    static void NQueen(List<List<String>> ans,char board[][],int col){
        if(col==board.length){
            ans.add(make(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(valid(row,board,col)){
                board[row][col]='Q';
                NQueen(ans,board,col+1);
                board[row][col]='.';
            }
        }
    }
    public static boolean valid(int row,char board[][], int col){
        int drow=row;
        int dcol=col;
        while(row>=0&&col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        row=drow;
        col=dcol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = drow;
        col = dcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }
    public static List < String > make(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        List<List<String>> ans=new ArrayList<>();
        NQueen(ans,board,0);
        return ans;
    }
}