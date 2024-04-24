class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        StringBuffer ans=new StringBuffer();
        for(int i=0;i<Math.min(strs[0].length(),strs[n-1].length());i++)
        {
            if(strs[0].charAt(i)!=strs[n-1].charAt(i))
            return ans.toString();
            else
            ans.append(strs[0].charAt(i));
        }
        return ans.toString();
    }
}