class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer ans=new StringBuffer("");
        int o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            {
                o++;
                if(o>1)
                ans.append("(");
            }
           else{
                
                if(o>1)
                ans.append(")");
                o--;
            }
        }
        return ans.toString();
        
    }
}