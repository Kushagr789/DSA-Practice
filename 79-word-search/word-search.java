class Solution {
    static boolean rec(char[][] board,String word, int i,int j,int c,int n,int m){
        if(c==word.length()){
            return true;
        }
        if(i<0||j<0||i==n||j==m|| board[i][j]!=word.charAt(c)||board[i][j]=='!'){
            return false;
        }
        char ch=board[i][j];
        board[i][j]='!';
        boolean top=rec(board,word,i-1,j,c+1,n,m);
        boolean right=rec(board,word,i,j+1,c+1,n,m);
        boolean left=rec(board,word,i,j-1,c+1,n,m);
        boolean bot=rec(board,word,i+1,j,c+1,n,m);
        board[i][j]=ch;
        return top||right||left||bot;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int x=0;x<n;x++){
            for(int y=0;y<m;y++){
                if(board[x][y]==word.charAt(0)){
                    if(rec(board,word,x,y,0,n,m))
                    return true;
                }
            }
        }
        return false;
    }
}