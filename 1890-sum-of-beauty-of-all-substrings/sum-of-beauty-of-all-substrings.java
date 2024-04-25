class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
                else
                map.put(ch,1);
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for (Map.Entry entry : map.entrySet()) {
                    min=Math.min(min,(int)entry.getValue());
                        max=Math.max(max,(int)entry.getValue());
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}