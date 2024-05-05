class Solution {
    public static void rec(List<String> ans,StringBuffer temp,int o,int c,int n){
        if(o==n&&c==o){
            ans.add(temp.toString());
            return;
        }
        if(o<n){
            temp.append("(");
            o++;
            rec(ans,temp,o,c,n);
            temp.deleteCharAt(temp.length()-1);
            o--;
        }
        if(o>c){
            temp.append(")");
            c++;
            rec(ans,temp,o,c,n);
            temp.deleteCharAt(temp.length()-1);
            
            c--;
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        rec(ans,new StringBuffer(),0,0,n);
        return ans;
    }
}