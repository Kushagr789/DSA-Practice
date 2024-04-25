class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int[] c=new int[26];
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                c[ch-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int x=0;x<26;x++)
                {
                    if(c[x]>0)
                    {
                        min=Math.min(min,c[x]);
                        max=Math.max(max,c[x]);
                    }
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}