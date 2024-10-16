class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                if(map.containsKey(board[i][j])) return false;
                map.put(board[i][j],1);
            }
            map.clear();
        }
        map.clear();
        for(int j=0;j<board.length;j++){
            for(int i=0;i<board[0].length;i++){
                if(board[i][j]=='.') continue;
                if(map.containsKey(board[i][j])) return false;
                map.put(board[i][j],1);
            }
            map.clear();
        }
        map.clear();
        int i=0;int m=0;
        while(i<board.length && m<board[0].length){
            for(int k=i;k<i+3;k++){
                for(int j=m;j<m+3;j++){
                    if(board[k][j]=='.') continue;
                    if(map.containsKey(board[k][j])) return false;
                    map.put(board[k][j],1);
                }
            }
            i=i+3;
            if(i>=board.length) {m=m+3;i=0;}
            map.clear();
        }
        return true;
    }
}