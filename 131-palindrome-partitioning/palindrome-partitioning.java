class Solution {
    public static void rec(List<List<String>>ans,String s,int ind, List<String> temp){
        if(ind==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<s.length();++i)
        {
            if(isPalindrome(s,ind,i)){
                temp.add(s.substring(ind,i+1));
                rec(ans,s,i+1,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--))
            return false;

        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        rec(ans,s,0,new ArrayList<>());
        return ans;
    }
}