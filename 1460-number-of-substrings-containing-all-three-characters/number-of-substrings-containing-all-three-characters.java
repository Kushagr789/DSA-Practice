class Solution {
    
    public int numberOfSubstrings(String s) {
        int l=0,r=0,cnt=0;
        int[] last={-1,-1,-1};
        while(r<s.length()){
            last[s.charAt(r)-'a']=r;
            if(last[0]!=-1&&last[1]!=-1&&last[2]!=-1)
            {
                cnt+=(1+(Math.min(last[0],Math.min(last[1],last[2]))));
            }
            r++;
        }
        return cnt;
    }
}