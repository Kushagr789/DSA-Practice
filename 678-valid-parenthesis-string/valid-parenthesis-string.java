class Solution {
    public boolean checkValidString(String s) {
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*')x++;
            else if(s.charAt(i)=='(')y++;
            else if(s.charAt(i)==')'){
                if(y==0&&x==0)return false;
                else if(y==0)x--;
                else
                y--;
            }
        }
        x=0;
        y=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*')x++;
            else if(s.charAt(i)==')')y++;
            else if(s.charAt(i)=='('){
                if(y==0&&x==0)return false;
                else if(y==0)x--;
                else
                y--;
            }
        }
        
        return true;
        

        

    }
}